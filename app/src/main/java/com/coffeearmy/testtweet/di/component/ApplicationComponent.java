package com.coffeearmy.testtweet.di.component;

import android.app.Application;
import android.content.Context;

import com.coffeearmy.testtweet.di.ApplicationContext;
import com.coffeearmy.testtweet.di.PerActivity;
import com.coffeearmy.testtweet.di.module.ActivityModule;
import com.coffeearmy.testtweet.di.module.ApplicationModule;
import com.coffeearmy.testtweet.ui.activiy.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    @ApplicationContext
    Context context();
    Application application();
}
