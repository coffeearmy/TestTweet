package com.coffeearmy.testtweet.di.component;


import com.coffeearmy.testtweet.di.PerActivity;
import com.coffeearmy.testtweet.di.module.ActivityModule;
import com.coffeearmy.testtweet.ui.activiy.MainActivity;
import com.coffeearmy.testtweet.ui.base.TweetPresenter;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);

    TweetPresenter getPresenter();
}
