package com.example.wyj.myapplication.fragment;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/**
 * Created by WangYajun on 2017/5/29 0029.
 */

public class SpacesAvgItemDecoration extends RecyclerView.ItemDecoration {

    private int space;

    public SpacesAvgItemDecoration(int space) {
        this.space = space;
    }


    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int pos = parent.getChildAdapterPosition(view);
        if (pos % 2 == 0) {
            outRect.left = space;
            outRect.right = space;
        } else {
            outRect.left = 0;
            outRect.right = space;
        }

        if (pos == 0 || pos == 1) {
            outRect.bottom = 0;
        }
        outRect.top = space;
    }
}
