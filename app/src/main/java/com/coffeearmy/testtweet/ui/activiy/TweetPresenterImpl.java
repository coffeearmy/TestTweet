package com.coffeearmy.testtweet.ui.activiy;

import com.coffeearmy.testtweet.ui.base.TweetPresenter;

import javax.inject.Inject;

/**
 * Created by elisadegregorio on 10/02/16.
 */
public class TweetPresenterImpl implements TweetPresenter{

    private TweetPresenter.View view;

    @Inject
    public TweetPresenterImpl() {
    }

    @Override
    public void onAttachView(View v) {
        this.view=v;
    }

    @Override
    public void onDetachView() {
        this.view = null;
    }

}
