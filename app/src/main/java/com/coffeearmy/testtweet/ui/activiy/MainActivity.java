package com.coffeearmy.testtweet.ui.activiy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.coffeearmy.testtweet.R;
import com.coffeearmy.testtweet.domain.model.Tweet;
import com.coffeearmy.testtweet.ui.base.BaseActivity;
import com.coffeearmy.testtweet.ui.base.TweetPresenter;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements TweetPresenter.View {

    @Inject TweetPresenter presenter;
    @Bind(R.id.tweet)
    TextView textTweet;
    @Bind(R.id.created_at)
    TextView textCreatedAt;
    @Bind(R.id.profile_image)
    ImageView profileImg;


    @Override
    protected int onRequestLayout() {return R.layout.activity_main;}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
        ButterKnife.bind(this);
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
        presenter.initRX();
    }

    @Override
    protected void onViewReady() {}


    @Override
    public void renderTweet(final Tweet tweet) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                textTweet.setText(tweet.getMessage());
                textCreatedAt.setText(tweet.getDate().toString());
                Glide.with(MainActivity.this).load(tweet.getPathPhoto()).into(profileImg);
            }
        });
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
