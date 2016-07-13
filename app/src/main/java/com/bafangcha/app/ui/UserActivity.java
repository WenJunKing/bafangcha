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
public class UserActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.title_tv)
    TextView titleTV;
    @BindView(R.id.ll_modify_nickname)
    RelativeLayout ll_NickName;
    @BindView(R.id.ll_modify_phone)
    RelativeLayout ll_Phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");
        toolbar.setBackgroundColor(ContextCompat.getColor(this, R.color.blue_header_bg));
        titleTV.setText("个人中心");
        titleTV.setTextColor(ContextCompat.getColor(this, R.color.white));
        SystemBarHelper.immersiveStatusBar(this);
        SystemBarHelper.setHeightAndPadding(this, toolbar);

        ll_NickName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserActivity.this, ModifyNickNameActivity.class);
                startActivity(intent);
            }
        });
        ll_Phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserActivity.this, ModifyPhoneActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
