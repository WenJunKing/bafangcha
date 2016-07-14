package com.bafangcha.app.ui;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.TextView;
import com.bafangcha.app.AppManager;
import com.bafangcha.app.R;
import com.bafangcha.app.interf.BaseViewInterface;
import com.bafangcha.app.widget.SystemBarHelper;
import butterknife.ButterKnife;

/**
 * Author: Created by wenjundu
 * Date:on 2016/7/14
 * Description:
 */
public abstract class BaseActivity extends AppCompatActivity implements BaseViewInterface{
    protected  Toolbar toolbar;
    protected  TextView titleTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * 竖屏
         */
        if (getRequestedOrientation() != ActivityInfo.SCREEN_ORIENTATION_PORTRAIT) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
        if (getContentViewLayoutID() != 0) {
            setContentView(getContentViewLayoutID());
        } else {
            throw new IllegalArgumentException("You must return a right contentView layout resource Id");
        }
        AppManager.getAppManager().addActivity(this);
        // 通过注解绑定控件
        ButterKnife.bind(this);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        titleTV= (TextView) findViewById(R.id.title_tv);
        if (null != toolbar) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
            SystemBarHelper.immersiveStatusBar(this);
            SystemBarHelper.setHeightAndPadding(this, toolbar);

        }
        if(titleTV!=null){
            setAppTitle(getAppTitle());
        }

        init(savedInstanceState);
        initView();
        initData();
        setListener();
    }

    protected void init(Bundle savedInstanceState) {
    }
    protected void setToolbarColor(int color){
        if(toolbar!=null)
        toolbar.setBackgroundColor(ContextCompat.getColor(this, color));
    }
    protected void setAppTitleColor(int color){
        if(titleTV!=null)
            titleTV.setTextColor(ContextCompat.getColor(this,color));
    }
    protected void setAppTitle(String title){
        if(!TextUtils.isEmpty(title)){
            titleTV.setText(title);
        }
    }
    protected abstract int getContentViewLayoutID();
    protected abstract String getAppTitle();
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AppManager.getAppManager().finishActivity(this);
    }
}
