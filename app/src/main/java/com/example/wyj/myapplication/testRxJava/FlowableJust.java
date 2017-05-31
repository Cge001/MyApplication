package com.example.wyj.myapplication.testRxJava;

import io.reactivex.Flowable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;

/**
 * Created by WangYajun on 2017/5/5 0005.
 */

public class FlowableJust implements IRxJava {

    @Override
    public void test() {
        Flowable.just("file.txt")
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(@NonNull String s) throws Exception {
                        return 99;
                    }
                });
    }
}
