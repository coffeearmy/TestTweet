package com.coffeearmy.testtweet.di.component;

import android.app.Application;
import android.content.Context;

import com.coffeearmy.testtweet.data.DataManager;
import com.coffeearmy.testtweet.data.mapper.TweetRemoteDataMapper;
import com.coffeearmy.testtweet.data.remote.TwitterService;
import com.coffeearmy.testtweet.di.ApplicationContext;
import com.coffeearmy.testtweet.di.PerActivity;
import com.coffeearmy.testtweet.di.module.ActivityModule;
import com.coffeearmy.testtweet.di.module.ApplicationModule;
import com.coffeearmy.testtweet.domain.usecase.GetMatchHourTweets;
import com.coffeearmy.testtweet.ui.activiy.MainActivity;
import com.coffeearmy.testtweet.ui.base.TweetPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    @ApplicationContext
    Context context();

    Application application();
    TweetRemoteDataMapper provideTweetRemoteDataMapper();
    DataManager provideDataManager();
    GetMatchHourTweets provideGetMatchHourTweets();


}
