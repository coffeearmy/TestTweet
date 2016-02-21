package com.coffeearmy.testtweet.di.module;

import android.app.Application;
import android.content.Context;

import com.coffeearmy.testtweet.data.DataManager;
import com.coffeearmy.testtweet.data.mapper.TweetRemoteDataMapper;
import com.coffeearmy.testtweet.data.remote.TwitterService;
import com.coffeearmy.testtweet.di.ApplicationContext;
import com.coffeearmy.testtweet.domain.usecase.GetMatchHourTweets;
import com.coffeearmy.testtweet.ui.activiy.TweetPresenterImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

//Initial setup for the Application
@Module
public class ApplicationModule {
    protected final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    GetMatchHourTweets provideGetMatchHourTweets(DataManager dataManager){
        return new GetMatchHourTweets(dataManager);
    }

    @Singleton
    @Provides
    DataManager provideDataManager(TweetRemoteDataMapper tweetRemoteDataMapper){
        return new DataManager(tweetRemoteDataMapper);
    }

    @Provides
    TweetRemoteDataMapper provideTweetRemoteDataMapper(){
        return new TweetRemoteDataMapper();
    }

}
