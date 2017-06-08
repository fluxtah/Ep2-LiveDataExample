package com.example.ianwarwick.livedataexample;

import android.arch.lifecycle.LiveData;
import android.util.Log;

public class LoggingLiveData extends LiveData<String> {
    @Override
    protected void onActive() {
        super.onActive();
        Log.d(Constants.TAG, "LoggingLiveData went active");
    }

    @Override
    protected void onInactive() {
        super.onInactive();
        Log.d(Constants.TAG, "LoggingLiveData went inactive");
    }

    /**
     * We expose this as public so it can be set
     * @param value
     */
    @Override
    public void setValue(String value) {
        super.setValue(value);
    }
}
