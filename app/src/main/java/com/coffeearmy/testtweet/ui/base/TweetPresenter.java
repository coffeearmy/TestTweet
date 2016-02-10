package com.coffeearmy.testtweet.ui.base;


import com.coffeearmy.testtweet.domain.model.Tweet;

/**
 * Created by elisadegregorio on 10/02/16.
 */
public interface TweetPresenter {
    void onAttachView(View v);
    void onDetachView();

    interface View {
        void renderTweet(Tweet tweet);
        void renderError();
        void renderEmpty();

    }
}
