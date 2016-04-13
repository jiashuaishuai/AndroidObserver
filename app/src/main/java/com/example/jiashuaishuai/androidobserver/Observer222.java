package com.example.jiashuaishuai.androidobserver;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jiashuaishuai on 2016/4/13.
 */
public class Observer222 implements Observer {
    @Override
    public void update(Observable observable, Object data) {
        Log.i("Observer222",data.toString());
    }
}
