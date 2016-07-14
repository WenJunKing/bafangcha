package com.bafangcha.app.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.bafangcha.app.R;
import com.bafangcha.app.ui.UserActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Author: Created by wenjundu
 * Date:on 2016/7/7
 * Description:
 */
public class MyselfFragment extends ABaseFragment {
    @BindView(R.id.layout_set)
    RelativeLayout rl_set;

    @Override
    protected int inflateContentView() {
        return R.layout.fragment_myself;
    }
    @Override
    protected void initData() {
        rl_set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), UserActivity.class);
                startActivity(intent);
            }
        });
    }

}
