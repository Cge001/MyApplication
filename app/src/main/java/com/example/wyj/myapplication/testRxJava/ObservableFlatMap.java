package com.example.wyj.myapplication.testRxJava;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/**
 * Created by WangYajun on 2017/5/5 0005.
 */

public class ObservableFlatMap implements IRxJava {

    @Override
    public void test() {
        List<String> mList = new ArrayList<>();
        mList.add("ddd");
        mList.add("fefefe");
        mList.add("fffefefe");

        Observable.just(mList)
                .flatMap(new Function<List<String>, ObservableSource<?>>() {
                    @Override
                    public ObservableSource<?> apply(@NonNull List<String> strings) throws Exception {
                        String[] arrStr;
                        arrStr = new String[strings.size()];
                        return Observable.fromArray(strings.toArray(arrStr));
                    }
                })
                .filter(new Predicate<Object>() {
                    @Override
                    public boolean test(@NonNull Object o) throws Exception {
                        int i = 0;
                        String str = (String) o;

                        Log.e(TAG, "test " + i++);

                        if (str.contains("fe")) {
                            return true;
                        }
                        return false;
                    }
                })
                .subscribe(new Consumer<Object>() {
                    @Override
                    public void accept(@NonNull Object o) throws Exception {
                        String str = (String) o;
                        Log.e(TAG, "accept " + ": " + str);
                    }
                });
    }
}
