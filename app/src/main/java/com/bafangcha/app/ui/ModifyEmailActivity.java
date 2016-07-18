package com.bafangcha.app.ui;

import android.widget.EditText;
import android.widget.TextView;

import com.bafangcha.app.R;

import butterknife.BindView;

/**
 * Author: Created by wenjundu
 * Date:on 2016/7/18
 * Description:修改邮箱
 */
public class ModifyEmailActivity extends BaseActivity{
    @BindView(R.id.modify_email_et)
    EditText emailET;
    @BindView(R.id.submit_btn)
    TextView btnSubmit;
    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_modify_email;
    }

    @Override
    protected String getAppTitle() {
        return getString(R.string.app_title_modify_email);
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
