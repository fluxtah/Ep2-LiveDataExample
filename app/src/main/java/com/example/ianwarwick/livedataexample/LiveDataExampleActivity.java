package com.example.ianwarwick.livedataexample;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

public class LiveDataExampleActivity extends LifecycleActivity {

    private LoggingLiveData mLoggingLiveData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data_example);

        mLoggingLiveData = new LoggingLiveData();

        mLoggingLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Log.d(Constants.TAG, "Observer onChanged called");
            }
        });

        mLoggingLiveData.setValue("Hello LiveData!");
    }
}
