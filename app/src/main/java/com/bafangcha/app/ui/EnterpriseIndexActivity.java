package com.bafangcha.app.ui;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bafangcha.app.R;
import butterknife.BindView;

/**
 * Author: Created by wenjundu
 * Date:on 2016/7/13
 * Description:公司详情 首页
 */
public class EnterpriseIndexActivity extends BaseActivity {

    @BindView(R.id.ll_more_info)
    LinearLayout ll_moreInfo;
    @BindView(R.id.show_more_info_tv)
    TextView showInfoTV;
    private Boolean isShowInfo=false;
    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_enterprise_index;
    }

    @Override
    protected String getAppTitle() {
        return null;
    }

    @Override
    public void initView() {

    }


    @Override
    public void initData() {
    }
    @Override
    public void setListener() {
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
