package com.example.wyj.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.wyj.myapplication.retrofit.GitHubService;
import com.example.wyj.myapplication.retrofit.bean.Contributor;
import com.example.wyj.myapplication.testRxJava.FlowableCreate;
import com.example.wyj.myapplication.testRxJava.IRxJava;
import com.example.wyj.myapplication.testRxJava.MaybeJust;
import com.example.wyj.myapplication.testRxJava.ObservableFlatMap;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "MainActivity";

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn_rxjava);
//        init();
        btn.setOnClickListener(this);
    }

    private void rxAndroidTest() {
//        Observable<Integer> observable = Observable.create(new ObservableOnSubscribe<Integer>() {
//            @Override
//            public void subscribe(@NonNull ObservableEmitter<Integer> e) throws Exception {
//                e.onNext(1);
//                e.onNext(2);
//                e.onComplete();
//            }
//        });
//
//        Observer<Integer> observer = new Observer<Integer>() {
//            @Override
//            public void onSubscribe(@NonNull Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(@NonNull Integer integer) {
//                Log.e(TAG, "onNext " + integer);
//            }
//
//            @Override
//            public void onError(@NonNull Throwable e) {
//                Log.e(TAG, "onError " + e.getMessage());
//            }
//
//            @Override
//            public void onComplete() {
//                Log.e(TAG, "onComplete");
//            }
//        };
//
//        observable.subscribe(observer);

//        Log.e(TAG, "之前 " + Thread.currentThread().getName());
//
//        Observable
//                .empty()
//                .doOnComplete(new Action() {
//                    @Override
//                    public void run() throws Exception {
//                        Log.e(TAG, "doOnComplete 1 " + Thread.currentThread().getName());
//                    }
//                })
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .doOnComplete(new Action() {
//                    @Override
//                    public void run() throws Exception {
//                        Log.e(TAG, "doOnComplete 2 " + Thread.currentThread().getName());
//                    }
//                })
//                .subscribe();

        IRxJava iRxJava = new ObservableFlatMap();
        iRxJava.test();
    }

    private void init() {
        String userName = "square";
        final String repo = "retrofit";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.gethub.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubService api = retrofit.create(GitHubService.class);
        Call<List<Contributor>> call = api.contributorsBySimpleGetCall(userName, repo);
        call.enqueue(new Callback<List<Contributor>>() {
            @Override
            public void onResponse(Call<List<Contributor>> call, Response<List<Contributor>> response) {
                List<Contributor> contributors = response.body();
                for (Contributor c : contributors) {
                    Log.d("login", c.getLogin());
                    Log.d("contributros", String.valueOf(c.getContributors()));
                }
            }

            @Override
            public void onFailure(Call<List<Contributor>> call, Throwable t) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_rxjava:
                rxAndroidTest();
                break;

            default:
                break;
        }
    }
}
