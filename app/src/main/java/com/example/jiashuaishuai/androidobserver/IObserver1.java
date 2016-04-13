package com.example.jiashuaishuai.androidobserver;

import android.util.Log;

/**
 * Created by jiashuaishuai on 2016/4/13.
 */
public class IObserver1 implements MyObserver {
    @Override
    public void updata(MyObservable myObservable, Object objects) {
        Log.i("IObserver1", objects.toString());
    }
}
