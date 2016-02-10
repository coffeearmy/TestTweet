package com.coffeearmy.testtweet.data.remote.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by elisadegregorio on 09/02/16.
 */
public class Entities {
    private List<Object> urls = new ArrayList<Object>();
    private List<Hashtag> hashtags = new ArrayList<Hashtag>();
    private List<Object> userMentions = new ArrayList<Object>();

    /**
     * @return The urls
     */
    public List<Object> getUrls() {
        return urls;
    }

    /**
     * @param urls The urls
     */
    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

    /**
     * @return The hashtags
     */
    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    /**
     * @param hashtags The hashtags
     */
    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    /**
     * @return The userMentions
     */
    public List<Object> getUserMentions() {
        return userMentions;
    }

    /**
     * @param userMentions The user_mentions
     */
    public void setUserMentions(List<Object> userMentions) {
        this.userMentions = userMentions;
    }
}
