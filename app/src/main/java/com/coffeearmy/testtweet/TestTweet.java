package com.coffeearmy.testtweet;

import android.app.Application;
import android.content.Context;

import com.coffeearmy.testtweet.di.component.ApplicationComponent;
import com.coffeearmy.testtweet.di.component.DaggerApplicationComponent;
import com.coffeearmy.testtweet.di.module.ApplicationModule;

public class TestTweet extends Application{
    ApplicationComponent mApplicationComponent;


    public static TestTweet get(Context context) {
        return (TestTweet) context.getApplicationContext();
    }

    public ApplicationComponent getComponent() {
        if (mApplicationComponent == null) {
            mApplicationComponent = DaggerApplicationComponent.builder()
                    .applicationModule(new ApplicationModule(this))
                    .build();
        }
        return mApplicationComponent;
    }

    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }
}
