package com.example.jiashuaishuai.androidobserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Observable;

public class MainActivity extends AppCompatActivity {
    /**
     * 自定义被观察者
     */
    private IObservable iObservable;
    IObserver iObserver1;
    /**
     * Observable
     */
    private Observable1 observable;
    private Observer111 observer111;
    private Observer222 observer222;
    private Observer333 observer333;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iObservable = new IObservable();
        iObserver1 = new IObserver();
        IObserver1 iObserver2 = new IObserver1();
        IObserver2 iObserver3 = new IObserver2();
        iObservable.addObserver(iObserver1);
        iObservable.addObserver(iObserver2);
        iObservable.addObserver(iObserver3);


        /////////////////////

        observable = new Observable1();
        observer111 = new Observer111();
        observer222 = new Observer222();
        observer333 = new Observer333();
        observable.addObserver(observer111);
        observable.addObserver(observer222);
        observable.addObserver(observer333);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.button2:
//        iObservable.removeObserver(iObserver1);
                iObservable.notifyObserver("发送通知");
                break;
            case R.id.button:
                observable.updata();
                break;
        }
    }

}
