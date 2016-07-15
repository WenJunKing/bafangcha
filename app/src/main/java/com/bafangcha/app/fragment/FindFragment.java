package com.bafangcha.app.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.bafangcha.app.R;
import com.bafangcha.app.widget.FlowTagView;
import com.bafangcha.app.widget.SystemBarHelper;
import butterknife.BindView;


/**
 * Author: Created by wenjundu
 * Date:on 2016/7/7
 * Description:
 */
public class FindFragment extends ABaseFragment {
//    @BindView(R.id.toolbar)
//    Toolbar mToolbar;
//    @BindView(R.id.title_tv)
//    TextView titleTV;
@BindView(R.id.tag_group)
FlowTagView tagGroup;
    String [] tags={"阿里巴巴","中商咨询","华为技术有限公司","勒布朗詹姆斯","科比布莱恩特"};
    @Override
    protected int inflateContentView() {
        return R.layout.fragment_lately_search;
    }

    @Override
    protected void initWidget(View root) {
//        SystemBarHelper.immersiveStatusBar(getActivity());
//        SystemBarHelper.setHeightAndPadding(getActivity(), mToolbar);
//        mToolbar.setTitle("");
//        titleTV.setText("发现");
        tagGroup.setTags(tags);
        tagGroup.setOnTagClickListener(new FlowTagView.OnTagClickListener() {
            @Override
            public void onTagClick(String tag) {
                Toast.makeText(getContext(),tag,Toast.LENGTH_SHORT).show();
            }
        });
    }

}
