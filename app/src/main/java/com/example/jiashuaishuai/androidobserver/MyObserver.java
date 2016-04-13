package com.example.jiashuaishuai.androidobserver;

import java.util.Objects;

/**
 * Created by jiashuaishuai on 2016/4/13.
 * 抽象观察者，
 */
public interface MyObserver {
    void updata(MyObservable myObservable, Object objects);
}
