package com.example.jiashuaishuai.androidobserver;

import java.util.Observable;

/**
 * Created by jiashuaishuai on 2016/4/13.
 * 继承才可以调用setChanged（）；
 */
public class Observable1 extends Observable {

    public void updata() {
        setChanged();
        notifyObservers("通知");
    }


}
