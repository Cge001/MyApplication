package com.example.wyj.myapplication.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wyj.myapplication.R;

/**
 * Created by WangYajun on 2017/5/29 0029.
 */

public class FragmentThree extends Fragment {

    private View root;

    private RecyclerView mRecyclerView;

    private FragmentThreeAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (root != null) {
            return root;
        }
        root = inflater.inflate(R.layout.fragment_two, container, false);
        return root;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        initView(view);
    }

    private void initView(View view) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(
                getContext(),
                2,
                GridLayoutManager.VERTICAL,
                false
        );
        mRecyclerView.setLayoutManager(gridLayoutManager);
        mRecyclerView.addItemDecoration(new SpacesAvgItemDecoration(20));
        mAdapter = new FragmentThreeAdapter();
        mRecyclerView.setAdapter(mAdapter);
    }
}
