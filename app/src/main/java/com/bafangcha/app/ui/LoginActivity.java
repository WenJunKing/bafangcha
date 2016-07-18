package com.bafangcha.app.ui;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bafangcha.app.R;
import butterknife.BindView;
/**
 * Author: Created by wenjundu
 * Date:on 2016/7/18
 * Description:登录
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener{
    //登录按钮
    @BindView(R.id.login_btn)
    Button loginBtn;
    //忘记密码
    @BindView(R.id.forget_password_tv)
    TextView forgetPasswordTV;
    //帐号注册
    @BindView(R.id.register_account_tv)
    TextView registerAccountTV;
    //QQ登录
    @BindView(R.id.ll_thridlogin_qq)
    LinearLayout ll_QQLogin;
    //微信登录
    @BindView(R.id.ll_thridlogin_wx)
    LinearLayout ll_WXLogin;
    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_login;
    }

    @Override
    protected String getAppTitle() {
        return getString(R.string.app_title_login);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void setListener() {
        loginBtn.setOnClickListener(this);
        forgetPasswordTV.setOnClickListener(this);
        registerAccountTV.setOnClickListener(this);
        ll_QQLogin.setOnClickListener(this);
        ll_WXLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=null;
        switch (v.getId()){
            case R.id.register_account_tv:
                intent=new Intent(LoginActivity.this,RegisterActivity.class);
                break;
        }
        if(intent!=null)
            startActivity(intent);
    }
}
