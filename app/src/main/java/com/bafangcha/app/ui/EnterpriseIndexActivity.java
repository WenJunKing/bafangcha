package com.bafangcha.app.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bafangcha.app.R;
import com.bafangcha.app.widget.SystemBarHelper;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Author: Created by wenjundu
 * Date:on 2016/7/13
 * Description:公司详情 首页
 */
public class EnterpriseIndexActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.title_tv)
    TextView titleTV;
    @BindView(R.id.ll_more_info)
    LinearLayout ll_moreInfo;
    @BindView(R.id.show_more_info_tv)
    TextView showInfoTV;

    private Boolean isShowInfo=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enterprise_index);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");
        toolbar.setBackgroundColor(ContextCompat.getColor(this, R.color.blue_header_bg));
        SystemBarHelper.immersiveStatusBar(this);
        SystemBarHelper.setHeightAndPadding(this, toolbar);

        showInfoTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable drawable=null;
                if(isShowInfo){
                    drawable= ContextCompat.getDrawable(EnterpriseIndexActivity.this,R.mipmap.arrow_down_close);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    showInfoTV.setCompoundDrawables(null,null,drawable,null);
                    ll_moreInfo.setVisibility(View.GONE);
                    isShowInfo=false;
                }else{
                    drawable= ContextCompat.getDrawable(EnterpriseIndexActivity.this,R.mipmap.arrow_up_expand);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    showInfoTV.setCompoundDrawables(null,null,drawable,null);
                    ll_moreInfo.setVisibility(View.VISIBLE);
                    isShowInfo=true;
                }
            }
        });

    }
}
