package com.coffeearmy.testtweet.data;

import com.coffeearmy.testtweet.data.mapper.TweetRemoteDataMapper;
import com.coffeearmy.testtweet.data.remote.TwitterService;
import com.coffeearmy.testtweet.data.remote.model.AuthResponse;
import com.coffeearmy.testtweet.data.remote.model.TweetRemote;
import com.coffeearmy.testtweet.domain.model.Tweet;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;
import rx.functions.Func1;

/**
 * This class allow other layers to access the data
 */
@Singleton
public class DataManager {

    private final TwitterService twitterService;
    private final TweetRemoteDataMapper tweetRemoteDataMapper;

    @Inject
    public DataManager(TwitterService twitterService, TweetRemoteDataMapper tweetRemoteDataMapper) {
        this.twitterService = twitterService;
        this.tweetRemoteDataMapper = tweetRemoteDataMapper;
    }
    ///TODO finish the calls to the twitterservice
    public Observable<AuthResponse> getAuthToken(){
        return null;
    }

    public Observable<List<Tweet>> getTweets(String query, String authToken){
        return twitterService.search(query,authToken,TwitterService.CONTENT_TYPE)
                .map(new Func1<TweetRemote, List<Tweet>>() {
                    @Override
                    public List<Tweet> call(TweetRemote tweetRemote) {
                        return tweetRemoteDataMapper.transform(tweetRemote);
                    }
                });
    }


}
