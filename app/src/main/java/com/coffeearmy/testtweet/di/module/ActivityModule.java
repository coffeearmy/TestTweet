package com.coffeearmy.testtweet.di.module;

import android.app.Activity;
import android.content.Context;

import com.coffeearmy.testtweet.di.ActivityContext;
import com.coffeearmy.testtweet.ui.activiy.TweetPresenterImpl;
import com.coffeearmy.testtweet.ui.base.TweetPresenter;

import dagger.Module;
import dagger.Provides;

//Initial module for the activities
@Module
public class ActivityModule {
    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    Activity provideActivity(){
        return activity;
    }

    @Provides
    @ActivityContext
    Context providesContext(){
        return activity;
    }

    @Provides
    TweetPresenter getPresenter(TweetPresenterImpl tweetPresenter) {
        return tweetPresenter;
    }

}
