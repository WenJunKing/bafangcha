package com.bafangcha.app.fragment;

import android.view.View;

import com.bafangcha.app.R;
import com.bafangcha.app.widget.FlowTagView;

import butterknife.BindView;


/**
 * Author: Created by wenjundu
 * Date:on 2016/7/14
 * Description:最近搜索
 */
public class LatelySearchFragment extends ABaseFragment {
    @BindView(R.id.tag_group)
    FlowTagView tagGroup;
    String [] tags={"阿里巴巴","阿里巴巴爸爸吧"};
    @Override
    protected int inflateContentView() {
        return R.layout.fragment_lately_search;
    }

    @Override
    protected void initWidget(View root) {
        tagGroup.setTags(tags);
    }

    @Override
    protected void initData() {
        super.initData();
    }
}
