package com.bafangcha.app.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;

/**
 * Author: Created by wenjundu
 * Date:on 2016/7/14
 * Description:
 */
public abstract class ABaseFragment extends Fragment {
    private ViewGroup rootView;// 根视图

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if (inflateContentView() > 0) {
            rootView = (ViewGroup) inflater.inflate(inflateContentView(), null);
            ButterKnife.bind(this, rootView);
            initWidget(rootView);
            initData();
            return rootView;
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    protected void initWidget(View root) {

    }

    protected void initData() {

    }
    abstract protected int inflateContentView();
}
