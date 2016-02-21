package com.coffeearmy.testtweet.domain.usecase;

import android.util.Log;

import com.coffeearmy.testtweet.data.DataManager;
import com.coffeearmy.testtweet.data.remote.model.TweetRemote;
import com.coffeearmy.testtweet.domain.model.Tweet;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import javax.inject.Inject;

import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;

/**
 * Created by elisadegregorio on 11/02/16.
 */
public class GetMatchHourTweets {

    private static final String TAG = GetMatchHourTweets.class.getSimpleName();
    private final DataManager dataManager;
    private final DateTime dateTime;
    private String[] timePattern={"HH:mm","KK:mm","HH:mm a"};

    @Inject
    public GetMatchHourTweets(DataManager dataManager) {
        this.dataManager = dataManager;
        dateTime = new DateTime();
    }

    ///TODO Some mocks for try this
    public Observable<List<Tweet>> getMatchHourTweets() {
        final String authToken = getAuthToken();

        //Get list of tweets from each query
       return Observable.from(timePattern).flatMap(new Func1<String, Observable<List<Tweet>>>() {
           @Override
           public Observable<List<Tweet>> call(String s) {
               try {
                   return dataManager.getTweets(getSearchQuery(s), authToken);
               } catch (UnsupportedEncodingException e) {
                   e.printStackTrace();
               }
               return null;
           }
       }).reduce(new Func2<List<Tweet>, List<Tweet>, List<Tweet>>() {
           @Override
           public List<Tweet> call(List<Tweet> tweets, List<Tweet> tweets2) {
               tweets.addAll(tweets2); //Reduce the lists to one list, is better to use collect
               return tweets;
           }
       }).onErrorReturn(new Func1<Throwable, List<Tweet>>() {
           @Override
           public List<Tweet> call(Throwable throwable) { //If a error occur we can know what is happening
               Log.e("TAG", throwable.getMessage());
               return new ArrayList<Tweet>();
           }
       }).flatMapIterable(new Func1<List<Tweet>, Iterable<Tweet>>() {
           @Override
           public Iterable<Tweet> call(List<Tweet> tweets) {
               return tweets; //Get one observable from each tweet
           }
       }).toSortedList(new Func2<Tweet, Tweet, Integer>() {
           @Override
           public Integer call(Tweet tweet, Tweet tweet2) {
               return tweet.compare(tweet2); //Comparing tweets
           }
       });
    }

    //We need a auth token
    private String getAuthToken() {
        return "Bearer AAAAAAAAAAAAAAAAAAAAAFA%2BkQAAAAAA4qJh69btvIgiOGVkuRqj5holDRA%3DgCymNtckR4PC5U5zT7b7aKJtLjmUHTD6iRDvdTp72ZVIpmwZCW";
    }

    private String getSearchQuery(String pattern) throws UnsupportedEncodingException {
        String date= getDateHourAsString(pattern);
        String firstPart=URLEncoder.encode("It’s " + date + " and", "UTF-8");
        String secondPart=URLEncoder.encode("It is "+date+" and","UTF-8");
        //Encoded with %
        return "\""+firstPart + "\"OR\"" + secondPart+"\"";
    }

    //Using Joda time, much better than calendar
    private String getDateHourAsString(String pattern) {
       return DateTimeFormat.forPattern(pattern).print(dateTime);
    }

}
