package com.coffeearmy.testtweet.ui.activiy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.coffeearmy.testtweet.R;
import com.coffeearmy.testtweet.ui.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int onRequestLayout() {return R.layout.activity_main;}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onViewReady() { }


}
