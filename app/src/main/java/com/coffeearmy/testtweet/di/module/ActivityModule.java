package com.coffeearmy.testtweet.di.module;

import android.app.Activity;
import android.content.Context;

import com.coffeearmy.testtweet.di.ActivityContext;

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

}
