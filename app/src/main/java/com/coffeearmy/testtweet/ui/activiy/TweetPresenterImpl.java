package com.coffeearmy.testtweet.ui.activiy;

import android.util.Log;

import com.coffeearmy.testtweet.data.remote.model.TweetRemote;
import com.coffeearmy.testtweet.domain.model.Tweet;
import com.coffeearmy.testtweet.domain.usecase.GetMatchHourTweets;
import com.coffeearmy.testtweet.ui.base.TweetPresenter;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;

/**
 * Created by elisadegregorio on 10/02/16.
 */
public class TweetPresenterImpl implements TweetPresenter {

    private static final String TAG = TweetPresenter.class.getSimpleName();
    private TweetPresenter.View view;
    private final GetMatchHourTweets getMatchHourTweets;

    @Inject
    public TweetPresenterImpl(GetMatchHourTweets getMatchHourTweets) {
        this.getMatchHourTweets = getMatchHourTweets;
    }

    @Override
    public void onAttachView(View v) {
        this.view = v;
    }

    @Override
    public void onDetachView() {
        this.view = null;
    }

    @Override
    public void initRX() {

        //Join observable with tweets with the timer for emit one tweet every 10 seconds
        Observable.zip(
                getMatchHourTweets.getMatchHourTweets().flatMapIterable(new Func1<List<Tweet>, Iterable<Tweet>>() {
                    @Override
                    public Iterable<Tweet> call(List<Tweet> tweets) {
                        return tweets;
                    }
                }), Observable.timer(0, 10, TimeUnit.SECONDS), new Func2<Tweet, Long, Tweet>() {
                    @Override
                    public Tweet call(Tweet tweet, Long aLong) {
                        return tweet;
                    }
                }).repeat() //Repeat the observable when is done emiting tweets
                .doOnError(new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        view.renderError();
                    }
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Tweet>() {
                    @Override
                    public void call(Tweet tweet) {
                        Log.d(TAG, tweet.getMessage());
                        view.renderTweet(tweet);
                    }
                });

    }

}
