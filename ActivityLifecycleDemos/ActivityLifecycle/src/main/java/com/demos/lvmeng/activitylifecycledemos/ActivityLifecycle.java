package com.demos.lvmeng.activitylifecycledemos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityLifecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
    }
}
