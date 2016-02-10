package com.coffeearmy.testtweet.ui.activiy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.coffeearmy.testtweet.R;
import com.coffeearmy.testtweet.domain.model.Tweet;
import com.coffeearmy.testtweet.ui.base.BaseActivity;
import com.coffeearmy.testtweet.ui.base.TweetPresenter;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements TweetPresenter.View {

    @Inject TweetPresenter presenter;

    @Override
    protected int onRequestLayout() {return R.layout.activity_main;}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.onDetachView();
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.onAttachView(this);
    }

    @Override
    protected void onViewReady() {
    //init lists, views ...
    }


    @Override
    public void renderTweet(Tweet images) {

    }

    @Override
    public void renderError() {
    //Render the error view
    }

    @Override
    public void renderEmpty() {
    //Render empty view
    }
}
