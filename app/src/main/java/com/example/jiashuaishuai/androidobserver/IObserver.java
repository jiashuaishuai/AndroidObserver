package com.example.jiashuaishuai.androidobserver;

import android.util.Log;

/**
 * Created by jiashuaishuai on 2016/4/13.
 * 具体观察者，实现抽象观察者接口
 */
public class IObserver implements MyObserver {


    @Override
    public void updata(MyObservable myObservable, Object object) {
        Log.i("IObserver", object.toString());
    }
}
