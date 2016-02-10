package com.coffeearmy.testtweet.di.module;

import android.app.Application;
import android.content.Context;

import com.coffeearmy.testtweet.di.ApplicationContext;

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

}
