package com.bafangcha.app.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bafangcha.app.R;
import com.bafangcha.app.widget.ProgressBarView;
import com.bafangcha.app.widget.SystemBarHelper;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Author: Created by wenjundu
 * Date:on 2016/7/7
 * Description:
 */
public class FindFragment extends Fragment {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.title_tv)
    TextView titleTV;
    @BindView(R.id.hehe)
    ProgressBarView progressBarView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_find, null);
        ButterKnife.bind(this, view);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        SystemBarHelper.immersiveStatusBar(getActivity());
        SystemBarHelper.setHeightAndPadding(getActivity(), mToolbar);
        mToolbar.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.white));
        mToolbar.setTitle("");
        titleTV.setTextColor(ContextCompat.getColor(getContext(), R.color.white));
        titleTV.setText("发现");
        progressBarView.setProgress(1800);
    }
}
