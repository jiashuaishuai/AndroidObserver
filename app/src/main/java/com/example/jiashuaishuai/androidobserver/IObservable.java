package com.example.jiashuaishuai.androidobserver;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiashuaishuai on 2016/4/13.
 * 具体 被观察者 实现抽象被观察者接口
 */
public class IObservable implements MyObservable {
    List<MyObserver> myObserverList = new ArrayList<>();

    @Override
    public void addObserver(MyObserver myObserver) {
        if (myObserver != null) {
            /**
             * 线程锁
             */
            synchronized (this) {
                /**
                 * 如果观察者列表中包含此观察者，则不添加
                 */
                if (!myObserverList.contains(myObserver))
                    myObserverList.add(myObserver);
            }
        } else {
            /**
             * 如果为空，给出错误提示
             */
            throw new NullPointerException("add myObserver==null");
        }

    }

    @Override
    public void removeObserver(MyObserver myObserver) {
//        if (myObserver != null) {
//            if (!myObserverList.contains(myObserver)) {
//
//            } else {
                myObserverList.remove(myObserver);
//            }
//        } else {
//            throw new NullPointerException("remove myObserver == null");
//        }
    }

    @Override
    public void notifyObserver(Object objects) {
        int i = 0;
/**
 * 循环通知列表中的每个观察者
 */
        for (MyObserver myObserver : myObserverList) {
            Log.i("IObservable", "" + ++i);
            myObserver.updata(this, objects);
        }
    }
}
