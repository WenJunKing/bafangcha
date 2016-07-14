package com.bafangcha.app.ui;

import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import com.bafangcha.app.R;
import butterknife.BindView;


/**
 * Author: Created by wenjundu
 * Date:on 2016/7/12
 * Description:修改昵称UI
 */
public class ModifyNickNameActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.title_tv)
    TextView titleTV;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_modify_nickname;
    }

    @Override
    protected String getAppTitle() {
        return getString(R.string.app_title_modify_name);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void setListener() {

    }
}
