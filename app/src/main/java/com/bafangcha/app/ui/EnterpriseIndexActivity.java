package com.bafangcha.app.ui;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bafangcha.app.R;
import com.bafangcha.app.widget.CircleImageView;

import butterknife.BindView;

/**
 * Author: Created by wenjundu
 * Date:on 2016/7/13
 * Description:公司详情 首页
 */
public class EnterpriseIndexActivity extends BaseActivity {
    //企业logo
    @BindView(R.id.ent_logo_iv)
    CircleImageView entLogoIV;
    //企业名称
    @BindView(R.id.ent_name_tv)
    TextView entNameTV;
    //企业类型
    @BindView(R.id.ent_type_tv)
    TextView entTypeTV;
    //企业经营状态
    @BindView(R.id.ent_status_tv)
    TextView entStatusTV;
    //企业更新时间
    @BindView(R.id.ent_update_time_tv)
    TextView entUpdateTV;
    //浏览人数
    @BindView(R.id.ent_look_count_tv)
    TextView entLookCountTV;
    //法定代表人
    @BindView(R.id.legal_representative_tv)
    TextView legalRepTV;
    //注册资本
    @BindView(R.id.registered_capital_tv)
    TextView registerCapTV;
    //注册时间
    @BindView(R.id.registered_date_tv)
    TextView registerDateTV;
    //联系电话
    @BindView(R.id.ent_tel_tv)
    TextView entTelTV;
    //其他联系信息layout
    @BindView(R.id.ll_more_info)
    LinearLayout ll_moreInfo;
    //显示其他联系信息textview
    @BindView(R.id.show_more_info_tv)
    TextView showInfoTV;
    //公司地址
    @BindView(R.id.ent_address_tv)
    TextView entAddressTV;
    //公司简介
    @BindView(R.id.ent_introduce_tv)
    TextView entIntroduceTV;
    //是否显示标识
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
        //假数据
        entNameTV.setText("深圳中商情报有限公司");
        entTypeTV.setText("有限责任公司(法人独资)");
        entStatusTV.setText("存续");
        entUpdateTV.setText("更新时间:2016-12-10");
        entLookCountTV.setText("30055");
        legalRepTV.setText("杨乖进");
        registerCapTV.setText("39999.99万元");
        registerDateTV.setText("1999.09.09");
        entTelTV.setText("0755-5646465");
        entAddressTV.setText("深圳市龙岗区坂田华为总部办公楼");
        entIntroduceTV.setText("乐视视频，原名乐视网，成立于2004年北京，被业界称为“乐视模式”。乐视垂直产业链整合业务涵盖互联网视频、影视制作与发行、智能终端、应用市场、电子商务、互联网智能电动汽车等；旗下公司包括乐视网、乐视致新、乐视移动、乐视影业、乐视体育、网酒网、乐视控股等；2014年乐视全生态业务总收入接近100亿元。");

    }
    @Override
    public void setListener() {
        showInfoTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable drawable=null;
                if(isShowInfo){
                    drawable= ContextCompat.getDrawable(EnterpriseIndexActivity.this,R.mipmap.icon_entindex_expand);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    showInfoTV.setCompoundDrawables(null,null,drawable,null);
                    ll_moreInfo.setVisibility(View.GONE);
                    isShowInfo=false;
                }else{
                    drawable= ContextCompat.getDrawable(EnterpriseIndexActivity.this,R.mipmap.icon_entindex_close);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    showInfoTV.setCompoundDrawables(null,null,drawable,null);
                    ll_moreInfo.setVisibility(View.VISIBLE);
                    isShowInfo=true;
                }
            }
        });
    }

}
