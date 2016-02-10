package com.coffeearmy.testtweet.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;
//we can differentiate between activity and application
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityContext {
}