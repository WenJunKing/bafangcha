package com.bafangcha.app.ui;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import com.bafangcha.app.R;
import com.bafangcha.app.widget.SystemBarHelper;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Author: Created by wenjundu
 * Date:on 2016/7/13
 * Description: 修改手机号码
 */
public class ModifyPhoneActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.title_tv)
    TextView titleTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_phone);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");
        toolbar.setBackgroundColor(ContextCompat.getColor(this, R.color.blue_header_bg));
        titleTV.setText("手机号码");
        titleTV.setTextColor(ContextCompat.getColor(this, R.color.white));
        SystemBarHelper.immersiveStatusBar(this);
        SystemBarHelper.setHeightAndPadding(this, toolbar);
    }
}
