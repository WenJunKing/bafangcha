package com.bafangcha.app.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bafangcha.app.R;
import com.bafangcha.app.widget.SystemBarHelper;

import butterknife.BindView;

/**
 * Author: Created by wenjundu
 * Date:on 2016/7/7
 * Description:
 */
public class AttentionFragment extends ABaseFragment {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.title_tv)
    TextView titleTV;
    @Override
    protected int inflateContentView() {
        return R.layout.fragment_attention;
    }


    @Override
    protected void initWidget(View root) {
        SystemBarHelper.immersiveStatusBar(getActivity());
        SystemBarHelper.setHeightAndPadding(getActivity(), toolbar);
        toolbar.setTitle("");
        titleTV.setText("关注");
    }

    @Override
    protected void initData() {
        super.initData();
    }
}
