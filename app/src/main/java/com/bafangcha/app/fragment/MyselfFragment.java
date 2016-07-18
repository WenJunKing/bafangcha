package com.bafangcha.app.fragment;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bafangcha.app.R;
import com.bafangcha.app.bean.UMShareImageBean;
import com.bafangcha.app.interf.UMShareCallBack;
import com.bafangcha.app.ui.LoginActivity;
import com.bafangcha.app.ui.SearchActivity;
import com.bafangcha.app.ui.UserActivity;
import com.bafangcha.app.widget.CircleImageView;
import com.bafangcha.app.widget.ShareDialog;
import com.umeng.socialize.media.UMImage;

import butterknife.BindView;

/**
 * Author: Created by wenjundu
 * Date:on 2016/7/7
 * Description:我的 fragment
 */
public class MyselfFragment extends ABaseFragment implements View.OnClickListener{
    //查企业
    @BindView(R.id.rl_query)
    RelativeLayout rl_query;
    //分享menu
    @BindView(R.id.rl_share)
    RelativeLayout rl_share;
    //设置menu
    @BindView(R.id.rl_set)
    RelativeLayout rl_set;
    //登录menu
    @BindView(R.id.ll_login)
    LinearLayout ll_login;
    //头像
    @BindView(R.id.avatar_iv)
    CircleImageView avatarIV;
    //昵称
    @BindView(R.id.username_tv)
    TextView userNameTV;

    private UMShareImageBean umShareImageBean;
    @Override
    protected int inflateContentView() {
        return R.layout.fragment_myself;
    }
    @Override
    protected void initData() {
        rl_set.setOnClickListener(this);
        ll_login.setOnClickListener(this);
        rl_share.setOnClickListener(this);
        rl_query.setOnClickListener(this);

        //分享图片 ，假数据，
        umShareImageBean=new UMShareImageBean();
        umShareImageBean.setShareText("hahahahah");
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.mark_07);
        UMImage image = new UMImage(getContext(), bitmap);
        umShareImageBean.setUmImage(image);
        umShareImageBean.setShareTitle("快快分享吧");
    }

    @Override
    public void onClick(View v) {
        Intent intent=null;
        switch (v.getId()){
            //登录
            case R.id.ll_login:
                intent = new Intent(getActivity(), LoginActivity.class);
                break;
            //查企业
            case  R.id.rl_query:
                intent=new Intent(getActivity(), SearchActivity.class);
                break;
            //分享
            case R.id.rl_share:
                ShareDialog shareDialog=new ShareDialog(getActivity(),umShareImageBean );
                shareDialog.setUmShareListener(new UMShareCallBack(getContext()));
                shareDialog.show();
                break;
            //设置
            case R.id.rl_set:
                intent = new Intent(getActivity(), UserActivity.class);
                break;
        }
        if(intent!=null)
            startActivity(intent);
    }
}
