package com.example.wyj.myapplication.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wyj.myapplication.R;

/**
 * Created by WangYajun on 2017/5/28 0028.
 */

public class HomePageAdapter extends RecyclerView.Adapter {

    /**
     * view 视图类型
     */
    public interface VIEW_TYPE {
        /**
         * 顶部的banner
         */
        int BANNER = 0;

        /**
         * 中间的番新闻
         */
        int FAN_SHOW = BANNER + 1;

        /**
         * 新番连载 head
         */
        int HEAD_LIANZAI = FAN_SHOW + 1;

        int LIANZAI = HEAD_LIANZAI + 1;

        int HEAD_WANJIE = LIANZAI + 1;

        int WANJIE = HEAD_WANJIE + 1;

        int HEAD_FENLEI = WANJIE + 1;

        int FENLEI = HEAD_FENLEI + 1;

        int HEAD_LIHAI = FENLEI + 1;

        int LIHAI = HEAD_LIHAI + 1;

        int HEAD_TUIJIAN = LIHAI + 1;

        int TUIJIAN = HEAD_TUIJIAN + 1;

        int STAGGED = TUIJIAN + 1;
    }

    /**
     * 每种viewtype body的数量
     */
    public interface BODY_COUNT {

        int BANNER = 1;

        int FANSHOW = 2;

        int HEAD_LIANZAI = 1;

        int LIANZAI = 4;

        int HEAD_WANJIE = 1;

        int WANJIE = 3;

        int HEAD_FENLEI = 1;

        int FENLEI = 3;

        int HEAD_LIHAI = 1;

        int LIHAI = 3;

        int HEAD_TUIJIAN = 1;

        int TUIJIAN = 2;

        int STAGGED = 10;
    }

    public interface VIEW_END {

        int BANNER_END = BODY_COUNT.BANNER - 1;

        int FANSHOW_END = BANNER_END + BODY_COUNT.FANSHOW;

        int HEAD_LIANZAI_END = FANSHOW_END + BODY_COUNT.HEAD_LIANZAI;

        int LIANZAI_END = HEAD_LIANZAI_END + BODY_COUNT.LIANZAI;

        int HEAD_WANJIE_END = LIANZAI_END + BODY_COUNT.HEAD_WANJIE;

        int WANJIE_END = HEAD_WANJIE_END + BODY_COUNT.WANJIE;

        int HEAD_FENLEI_END = WANJIE_END + BODY_COUNT.HEAD_FENLEI;

        int FENLEI_END = HEAD_FENLEI_END + BODY_COUNT.FENLEI;

        int HEAD_LIHAI_END = FENLEI_END + BODY_COUNT.HEAD_LIHAI;

        int LIHAI_END = HEAD_LIHAI_END + BODY_COUNT.LIHAI;

        int HEAD_TUIJIAN_END = LIHAI_END + BODY_COUNT.HEAD_TUIJIAN;

        int TUIJIAN_END = HEAD_TUIJIAN_END + BODY_COUNT.TUIJIAN;

        int STAGGED_END = TUIJIAN_END + BODY_COUNT.STAGGED;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater mInflater = LayoutInflater.from(parent.getContext());

        switch (viewType) {
            case VIEW_TYPE.BANNER:
                return new VhBanner(mInflater.inflate(
                        R.layout.view_type_banner,
                        parent, false));

            case VIEW_TYPE.FAN_SHOW:
                return new VhFanShow(mInflater.inflate(
                        R.layout.view_type_fanshow,
                        parent, false));

            case VIEW_TYPE.HEAD_LIANZAI:
                return new VhHeadLianZai(mInflater.inflate(
                        R.layout.view_type_head_lianzai,
                        parent, false));

            case VIEW_TYPE.LIANZAI:
                return new VhLianZai(mInflater.inflate(
                        R.layout.view_type_lianzai,
                        parent, false));

            case VIEW_TYPE.HEAD_WANJIE:
                return new VhHeadFenlei(mInflater.inflate(
                        R.layout.view_type_head_lianzai,
                        parent, false));

            case VIEW_TYPE.WANJIE:
                return new VhHeadFenlei(mInflater.inflate(
                        R.layout.view_type_wanjie,
                        parent, false));

            case VIEW_TYPE.HEAD_FENLEI:
                return new VhHeadFenlei(mInflater.inflate(
                        R.layout.view_type_head_lianzai,
                        parent, false));

            case VIEW_TYPE.FENLEI:
                return new VhHeadFenlei(mInflater.inflate(
                        R.layout.view_type_fenlei,
                        parent, false));

            case VIEW_TYPE.HEAD_LIHAI:
                return new VhHeadFenlei(mInflater.inflate(
                        R.layout.view_type_head_lianzai,
                        parent, false));

            case VIEW_TYPE.LIHAI:
                return new VhHeadFenlei(mInflater.inflate(
                        R.layout.view_type_lihai,
                        parent, false));

            case VIEW_TYPE.HEAD_TUIJIAN:
                return new VhHeadFenlei(mInflater.inflate(
                        R.layout.view_type_head_lianzai,
                        parent, false));

            case VIEW_TYPE.TUIJIAN:
                return new VhHeadFenlei(mInflater.inflate(
                        R.layout.view_type_tuijian,
                        parent, false));

            case VIEW_TYPE.STAGGED:
                return new VhHeadFenlei(mInflater.inflate(
                        R.layout.view_type_tuijian,
                        parent, false));

            default:
                break;
        }
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        //
        if (position <= VIEW_END.BANNER_END) {
            return VIEW_TYPE.BANNER;
        }

        //
        else if (position <= VIEW_END.FANSHOW_END) {
            return VIEW_TYPE.FAN_SHOW;
        }

        //
        else if (position < VIEW_END.HEAD_LIANZAI_END) {
            return VIEW_TYPE.HEAD_LIANZAI;
        }

        //
        else if (position <= VIEW_END.LIANZAI_END) {
            return VIEW_TYPE.LIANZAI;
        }

        //
        else if (position <= VIEW_END.HEAD_WANJIE_END) {
            return VIEW_TYPE.HEAD_WANJIE;
        }

        //
        else if (position <= VIEW_END.WANJIE_END) {
            return VIEW_TYPE.WANJIE;
        }

        //
        else if (position <= VIEW_END.HEAD_FENLEI_END) {
            return VIEW_TYPE.HEAD_FENLEI;
        }

        //
        else if (position <= VIEW_END.FENLEI_END) {
            return VIEW_TYPE.HEAD_FENLEI;
        }

        //
        else if (position <= VIEW_END.HEAD_LIHAI_END) {
            return VIEW_TYPE.HEAD_LIHAI;
        }

        //
        else if (position <= VIEW_END.LIHAI_END) {
            return VIEW_TYPE.LIHAI;
        }

        //
        else if (position <= VIEW_END.HEAD_TUIJIAN_END) {
            return VIEW_TYPE.HEAD_TUIJIAN;
        }

        //
        else if (position <= VIEW_END.TUIJIAN_END) {
            return VIEW_TYPE.TUIJIAN;
        }

        //
        else {
            return VIEW_TYPE.STAGGED;
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);

        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {

                @Override
                public int getSpanSize(int position) {
                    switch (getItemViewType(position)) {
                        case VIEW_TYPE.BANNER:
                        case VIEW_TYPE.HEAD_LIANZAI:
                        case VIEW_TYPE.HEAD_WANJIE:
                        case VIEW_TYPE.HEAD_FENLEI:
                        case VIEW_TYPE.HEAD_LIHAI:
                        case VIEW_TYPE.HEAD_TUIJIAN:
                        case VIEW_TYPE.TUIJIAN:
                            return gridLayoutManager.getSpanCount();
                        case VIEW_TYPE.FAN_SHOW:
                        case VIEW_TYPE.LIANZAI:
                        case VIEW_TYPE.LIHAI:
                        case VIEW_TYPE.STAGGED:
                            return 3;
                        case VIEW_TYPE.WANJIE:
                        case VIEW_TYPE.FENLEI:
                            return 2;

                        default:
                            break;
                    }
                    return 3;
                }
            });
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case VIEW_TYPE.BANNER:
                ((VhBanner) holder).setData(position);
                break;

            case VIEW_TYPE.FAN_SHOW:
                ((VhFanShow) holder).setData(position);
                break;

            case VIEW_TYPE.HEAD_LIANZAI:
                break;

            case VIEW_TYPE.LIANZAI:
                break;

            case VIEW_TYPE.HEAD_WANJIE:
                break;

            case VIEW_TYPE.WANJIE:
                break;

            case VIEW_TYPE.HEAD_FENLEI:
                break;

            case VIEW_TYPE.FENLEI:
                break;

            case VIEW_TYPE.HEAD_LIHAI:
                break;

            case VIEW_TYPE.LIHAI:
                break;

            case VIEW_TYPE.HEAD_TUIJIAN:
                break;

            case VIEW_TYPE.TUIJIAN:
                break;

            case VIEW_TYPE.STAGGED:
                break;

            default:
                break;
        }
    }

    @Override
    public int getItemCount() {
//        return BODY_COUNT.BANNER +
//                BODY_COUNT.FANSHOW +
//                BODY_COUNT.HEAD_LIANZAI +
//                BODY_COUNT.LIANZAI +
//                BODY_COUNT.HEAD_WANJIE +
//                BODY_COUNT.WANJIE +
//                BODY_COUNT.HEAD_FENLEI +
//                BODY_COUNT.FENLEI +
//                BODY_COUNT.HEAD_LIHAI +
//                BODY_COUNT.LIHAI +
//                BODY_COUNT.HEAD_TUIJIAN +
//                BODY_COUNT.TUIJIAN +
//                BODY_COUNT.STAGGED;
        return 50;
    }

    class VhBanner extends RecyclerView.ViewHolder {

        private ImageView mImg;

        private TextView mTvTitle;

        public VhBanner(View itemView) {
            super(itemView);

            mImg = (ImageView) itemView.findViewById(R.id.img_banner);
        }

        private void setData(int pos) {
            mImg.setScaleType(ImageView.ScaleType.FIT_XY);
//            mImg.setBackgroundResource(R.mipmap.ic_launcher);
        }
    }

    class VhFanShow extends RecyclerView.ViewHolder {

        private ImageView mImg;

        private TextView mTvTitle;

        public VhFanShow(View itemView) {
            super(itemView);

            mImg = (ImageView) itemView.findViewById(R.id.img_bg);
            mTvTitle = (TextView) itemView.findViewById(R.id.tv_title);
        }

        private void setData(int pos) {
//            mImg.setBackgroundResource(R.mipmap.ic_launcher);
        }
    }

    class VhHeadLianZai extends RecyclerView.ViewHolder {

        public VhHeadLianZai(View itemView) {
            super(itemView);
        }
    }

    class VhLianZai extends RecyclerView.ViewHolder {

        public VhLianZai(View itemView) {
            super(itemView);
        }
    }

    class VhHeadWanjie extends RecyclerView.ViewHolder {

        public VhHeadWanjie(View itemView) {
            super(itemView);
        }
    }

    class VhWanjie extends RecyclerView.ViewHolder {

        public VhWanjie(View itemView) {
            super(itemView);
        }
    }

    class VhHeadFenlei extends RecyclerView.ViewHolder {

        public VhHeadFenlei(View itemView) {
            super(itemView);
        }
    }

    class VhFenlei extends RecyclerView.ViewHolder {

        public VhFenlei(View itemView) {
            super(itemView);
        }
    }

    class VhHeadLihai extends RecyclerView.ViewHolder {

        public VhHeadLihai(View itemView) {
            super(itemView);
        }
    }

    class VhLihai extends RecyclerView.ViewHolder {

        public VhLihai(View itemView) {
            super(itemView);
        }
    }

    class VhHeadTuijian extends RecyclerView.ViewHolder {

        public VhHeadTuijian(View itemView) {
            super(itemView);
        }
    }

    class VhTuijian extends RecyclerView.ViewHolder {

        public VhTuijian(View itemView) {
            super(itemView);
        }
    }
}

