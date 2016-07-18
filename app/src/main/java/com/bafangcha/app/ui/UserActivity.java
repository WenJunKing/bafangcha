package com.bafangcha.app.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bafangcha.app.R;
import com.bafangcha.app.widget.SystemBarHelper;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Author: Created by wenjundu
 * Date:on 2016/7/11
 * Description:个人中心
 */
public class UserActivity extends BaseActivity {
    @BindView(R.id.rl_modify_nickname)
    RelativeLayout rl_NickName;
    @BindView(R.id.rl_modify_phone)
    RelativeLayout rl_Phone;
    @BindView(R.id.rl_modify_email)
    RelativeLayout rl_email;
    @BindView(R.id.rl_modify_password)
    RelativeLayout rl_password;
    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_user;
    }

    @Override
    protected String getAppTitle() {
        return getString(R.string.app_title_user_center);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void setListener() {
        rl_NickName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserActivity.this, ModifyNickNameActivity.class);
                startActivity(intent);
            }
        });
        rl_Phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserActivity.this, ModifyPhoneActivity.class);
                startActivity(intent);
            }
        });
        rl_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserActivity.this, ModifyEmailActivity.class);
                startActivity(intent);
            }
        });
        rl_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserActivity.this, ModifyPasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}
