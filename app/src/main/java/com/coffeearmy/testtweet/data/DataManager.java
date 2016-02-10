package com.coffeearmy.testtweet.data;

import com.coffeearmy.testtweet.data.remote.TwitterService;
import com.coffeearmy.testtweet.data.remote.model.AuthResponse;
import com.coffeearmy.testtweet.data.remote.model.Tweet;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;

/**
 * This class allow other layers to access the data
 */
@Singleton
public class DataManager {

    private final TwitterService twitterService;

    @Inject
    public DataManager(TwitterService twitterService) {
        this.twitterService = twitterService;
    }
    ///TODO finish the calls to the twitterservice
    public Observable<AuthResponse> getAuthToken(){
        return null;
    }

    public Observable<Tweet> getTweets(String query){
        return null;
    }


}
