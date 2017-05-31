package com.example.wyj.myapplication.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.wyj.myapplication.R;
import com.example.wyj.myapplication.fragment.HomePageAdapter;

/**
 * Created by WangYajun on 2017/5/29 0029.
 */

public class RecyclerViewTestActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    HomePageAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_fragment);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new GridLayoutManager(
                this,
                6,
                GridLayoutManager.VERTICAL,
                false
        ));
        mAdapter = new HomePageAdapter();
        mRecyclerView.setAdapter(mAdapter);
    }
}
