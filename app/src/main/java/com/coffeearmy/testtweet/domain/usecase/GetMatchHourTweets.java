package com.coffeearmy.testtweet.domain.usecase;

import com.coffeearmy.testtweet.data.DataManager;
import com.coffeearmy.testtweet.domain.model.Tweet;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.functions.Func1;
import rx.functions.Func2;

/**
 * Created by elisadegregorio on 11/02/16.
 */
public class GetMatchHourTweets {

    private final DataManager dataManager;

    @Inject
    public GetMatchHourTweets(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    ///TODO Some mocks for try this
    public Observable<Tweet> getMatchHourTweets(){
        String authToken= getAuthToken();
        String query = getSearchQuery();
        return Observable.from((Iterable<Tweet>) dataManager.getTweets(query, authToken))
                .toSortedList(new Func2<Tweet, Tweet, Integer>() {
                    @Override
                    public Integer call(Tweet tweet, Tweet tweet2) {
                        return null; ///TODO order logic
                    }
                }).flatMap(new Func1<List<Tweet>, Observable<Tweet>>() {
                    @Override
                    public Observable<Tweet> call(List<Tweet> tweets) {
                        return Observable.from(tweets);
                    }
                });
    }

    private String getAuthToken() {
        return null;
    }

    private String getSearchQuery() {
        return null;
    }
}
