package com.example.wyj.myapplication.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wyj.myapplication.R;

/**
 * Created by WangYajun on 2017/5/9 0009.
 */

public class FragmentOne extends Fragment {

    private View root;

    private RecyclerView mRecyclerView;

    private HomePageAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (root != null) {
            return root;
        }
        root = inflater.inflate(R.layout.one_fragment, container, false);
        return root;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        initView(view);
    }

    /**
     * init view
     *
     * @param view
     */
    private void initView(View view) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new GridLayoutManager(
                getContext(),
                6,
                GridLayoutManager.VERTICAL,
                false));
        mRecyclerView.addItemDecoration(new SpacesItemDecoration(10));
        mAdapter = new HomePageAdapter();
        mRecyclerView.setAdapter(mAdapter);
    }
}
