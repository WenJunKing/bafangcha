package com.bafangcha.app.ui;

import android.content.Intent;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.bafangcha.app.R;

import butterknife.BindView;

/**
 * Author: Created by wenjundu
 * Date:on 2016/7/18
 * Description:用户注册
 */
public class RegisterActivity extends BaseActivity implements View.OnClickListener{
    @BindView(R.id.agreement_tv)
    TextView agreementTV;
    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_register;
    }

    @Override
    protected String getAppTitle() {
        return getString(R.string.app_title_register);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {
        agreementTV.setText(Html.fromHtml("<u>"+getString(R.string.tv_agreement)+"<u>"));
        agreementTV.setOnClickListener(this);
    }

    @Override
    public void setListener() {

    }

    @Override
    public void onClick(View v) {
        Intent intent=null;
        switch (v.getId()){
            case R.id.agreement_tv:
                intent=new Intent(RegisterActivity.this,AgreementActivity.class);
                break;
        }
        if(intent!=null)
            startActivity(intent);
    }
}
