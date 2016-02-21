package com.coffeearmy.testtweet.data;

import android.util.Log;

import com.coffeearmy.testtweet.data.mapper.TweetRemoteDataMapper;
import com.coffeearmy.testtweet.data.remote.TwitterService;
import com.coffeearmy.testtweet.data.remote.model.AuthResponse;
import com.coffeearmy.testtweet.data.remote.model.TweetRemote;
import com.coffeearmy.testtweet.domain.model.Tweet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import okhttp3.RequestBody;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * This class allow other layers to access the data
 */
@Singleton
public class DataManager {
    private final String TAG = DataManager.class.getSimpleName();
    private final TwitterService twitterService;
    private final TweetRemoteDataMapper tweetRemoteDataMapper;

    @Inject
    public DataManager(TweetRemoteDataMapper tweetRemoteDataMapper) {
        this.twitterService = TwitterService.Creator.newTwitterService();
        this.tweetRemoteDataMapper = tweetRemoteDataMapper;
    }

    public Observable<AuthResponse> getAuthToken(RequestBody grantType, String auth){
        return twitterService.authUser(auth,TwitterService.CONTENT_TYPE,grantType).subscribeOn(Schedulers.io());

    }

    public Observable<List<Tweet>> getTweets(String query, String authToken){
        return twitterService.search(query, authToken, TwitterService.CONTENT_TYPE)
                .map(new Func1<TweetRemote, List<Tweet>>() {
                    @Override
                    public List<Tweet> call(TweetRemote tweetRemote) { //Return a list with tweets (domain) created from the tweets (API)
                      return tweetRemoteDataMapper.transform(tweetRemote);
                    }
                }).subscribeOn(Schedulers.io()).onErrorReturn(new Func1<Throwable, List<Tweet>>() {
                    @Override
                    public List<Tweet> call(Throwable throwable) {
                        Log.e(TAG, throwable.getMessage());
                        return new ArrayList<Tweet>();

                    }
                });

    }

    public Observable<TweetRemote> getTweetsCall(String query, String authToken){
        return twitterService.search(query, authToken, TwitterService.CONTENT_TYPE).subscribeOn(Schedulers.io());
    }


}
