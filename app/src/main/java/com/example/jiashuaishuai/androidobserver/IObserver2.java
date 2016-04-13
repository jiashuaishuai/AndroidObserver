package com.example.jiashuaishuai.androidobserver;

import android.util.Log;

/**
 * Created by jiashuaishuai on 2016/4/13.
 */
public class IObserver2 implements MyObserver {
    @Override
    public void updata(MyObservable myObservable, Object objects) {
        Log.i("IObserver2", objects.toString());
    }
}
