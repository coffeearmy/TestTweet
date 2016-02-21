package com.coffeearmy.testtweet.data.mapper;

import com.coffeearmy.testtweet.data.remote.model.Status;
import com.coffeearmy.testtweet.data.remote.model.TweetRemote;
import com.coffeearmy.testtweet.domain.model.Tweet;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Mapper class used to transform {@link TweetRemote} to
 * {@link com.coffeearmy.testtweet.domain.model.Tweet}
 */
@Singleton
public class TweetRemoteDataMapper {

    @Inject
    public TweetRemoteDataMapper(){}

    public Tweet transform (Status tweetRemote){
        Tweet tweet = null;
        if(tweetRemote!=null){
            tweet= new Tweet();
            tweet.setMessage(tweetRemote.getText());
            tweet.setName(tweetRemote.getUser().getName());
            tweet.setNick(tweetRemote.getUser().getScreenName()==null ? "" : tweetRemote.getUser().getScreenName());
            tweet.setPathPhoto(tweetRemote.getUser().getProfileImageUrl()==null ? "" : tweetRemote.getUser().getProfileImageUrl());
            tweet.setNumRetweets(tweetRemote.getRetweetCount()==null? 0 : tweetRemote.getRetweetCount());
            tweet.setDate(tweetRemote.getCreatedAt());
        }
        return tweet;
    }

    public List<Tweet> transform(TweetRemote tweetRemote) {
        List<Tweet> tweetList= new ArrayList<>();
        Tweet tweet;
        if(tweetRemote!=null) {
            for (Status status : tweetRemote.getStatuses()) {
                tweet = transform(status);
                if (tweet != null)
                    tweetList.add(tweet);
            }
        }
        return  tweetList;
    }

}
