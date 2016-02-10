package com.coffeearmy.testtweet.ui.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.coffeearmy.testtweet.TestTweet;
import com.coffeearmy.testtweet.di.component.ActivityComponent;
import com.coffeearmy.testtweet.di.component.DaggerActivityComponent;
import com.coffeearmy.testtweet.di.module.ActivityModule;


import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    private ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(onRequestLayout());
        initializeViewsInjection();
    }

    public ActivityComponent getActivityComponent() {
        if (mActivityComponent == null) {
            mActivityComponent = DaggerActivityComponent.builder()
                    .activityModule(new ActivityModule(this))
                    .applicationComponent(TestTweet.get(this).getComponent())
                    .build();
        }
        return mActivityComponent;
    }

    private void initializeViewsInjection() {
        ButterKnife.bind(this);
        onViewReady();
    }

    protected abstract void onViewReady();

    protected abstract int onRequestLayout();
}