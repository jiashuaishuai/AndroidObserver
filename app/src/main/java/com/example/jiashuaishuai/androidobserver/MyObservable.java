package com.example.jiashuaishuai.androidobserver;

/**
 * Created by jiashuaishuai on 2016/4/13.
 * 抽象被观察者
 */
public interface MyObservable {
    /**
     * 添加观察者
     * @param myObserver
     */
    void addObserver(MyObserver myObserver);

    /**
     * 删除观察者
     * @param myObserver
     */
    void removeObserver(MyObserver myObserver);

    /**
     * 通知观察者
     * @param objects
     */

    void notifyObserver(Object objects);
}
