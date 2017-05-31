package com.example.wyj.myapplication.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.wyj.myapplication.R;

/**
 * Created by WangYajun on 2017/5/9 0009.
 */

public class TestActivity extends AppCompatActivity implements View.OnClickListener {

    FragmentOne fragmentOne;

    FragmentTwo fragmentTwo;

    FragmentThree fragmentThird;

    TextView tv1;
    TextView tv2;
    TextView tv3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        findViews();
        setListeners();
        fillContent();
    }

    private void setListeners() {
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
    }

    private void findViews() {
        tv1 = (TextView) findViewById(R.id.tv_1);
        tv2 = (TextView) findViewById(R.id.tv_2);
        tv3 = (TextView) findViewById(R.id.tv_3);
    }

    private void fillContent() {
        init1();
    }

    private void init1() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        if (fragmentOne == null) {
            fragmentOne = new FragmentOne();
            Bundle bundle = new Bundle();
            bundle.putString("name", "你好");
            fragmentOne.setArguments(bundle);
            transaction.add(R.id.contentFrame, fragmentOne);
        }

        hideAll();
        transaction.show(fragmentOne);
        transaction.commit();
    }

    private void init2() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (fragmentTwo == null) {
            fragmentTwo = new FragmentTwo();
            Bundle bundle = new Bundle();
            bundle.putString("name", "早上好");
            fragmentTwo.setArguments(bundle);
            transaction.add(R.id.contentFrame, fragmentTwo);
        }

        hideAll();
        transaction.show(fragmentTwo);
        transaction.commit();
    }

    private void init3() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        if (fragmentThird == null) {
            fragmentThird = new FragmentThree();
            Bundle bundle = new Bundle();
            bundle.putString("name", "晚上好");
            fragmentThird.setArguments(bundle);
            transaction.add(R.id.contentFrame, fragmentThird);
        }

        hideAll();
        transaction.show(fragmentThird);
        transaction.commit();
    }

    private void hideAll() {
        if (fragmentOne != null) {
            getSupportFragmentManager().beginTransaction().hide(fragmentOne).commit();
        }

        if (fragmentTwo != null)
            getSupportFragmentManager().beginTransaction().hide(fragmentTwo).commit();

        if (fragmentThird != null)
            getSupportFragmentManager().beginTransaction().hide(fragmentThird).commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_1:
                init1();
                break;

            case R.id.tv_2:
                init2();
                break;

            case R.id.tv_3:
                init3();
                break;

            default:
                break;
        }
    }
}
