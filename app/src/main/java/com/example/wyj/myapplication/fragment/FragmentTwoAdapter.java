package com.example.wyj.myapplication.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wyj.myapplication.R;

/**
 * Created by WangYajun on 2017/5/29 0029.
 */

public class FragmentTwoAdapter extends RecyclerView.Adapter {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Vh(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_type_lianzai,
                parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof Vh) {
            ((Vh) holder).setData(position);
        }
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class Vh extends RecyclerView.ViewHolder {

        public Vh(View itemView) {
            super(itemView);
        }

        private void setData(int pos) {

        }
    }
}
