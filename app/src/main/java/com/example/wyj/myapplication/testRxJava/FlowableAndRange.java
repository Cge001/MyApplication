package com.example.wyj.myapplication.testRxJava;

import android.graphics.LinearGradient;
import android.util.Log;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.Flowable;

/**
 * Created by WangYajun on 2017/5/5 0005.
 */

public class FlowableAndRange implements IRxJava {

    @Override
    public void test() {
        Flowable.range(0,10)
                .subscribe(new Subscriber<Integer>() {
                    Subscription subscription;

                    @Override
                    public void onSubscribe(Subscription s) {
                        Log.e(TAG, "onSUbscribe start");
                        subscription = s;
                        s.request(1);
                        Log.e(TAG, "onSubscribe end");
                    }

                    @Override
                    public void onNext(Integer integer) {
                        Log.e(TAG, "onNext---> " + integer);
                        subscription.request(1);
                    }

                    @Override
                    public void onError(Throwable t) {
                        t.printStackTrace();
                    }

                    @Override
                    public void onComplete() {
                        Log.e(TAG, "onComplete");
                    }
                });
    }
}
