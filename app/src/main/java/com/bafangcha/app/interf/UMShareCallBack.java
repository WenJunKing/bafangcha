package com.bafangcha.app.interf;

import android.content.Context;

import com.bafangcha.app.R;
import com.bafangcha.app.util.ToastUtil;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;

/**
 * Author: Created by wenjundu
 * Date:on 2016/2/26
 * Description:
 */
public class UMShareCallBack implements UMShareListener {
    private Context context;
    public UMShareCallBack(Context context){
        this.context=context;
    }
    @Override
    public void onResult(SHARE_MEDIA share_media) {
        ToastUtil.TextToast(context, share_media + context.getString(R.string.tip_share_successed));
    }

    @Override
    public void onError(SHARE_MEDIA share_media, Throwable throwable) {
        ToastUtil.TextToast(context,share_media+context.getString(R.string.tip_share_fail));
    }

    @Override
    public void onCancel(SHARE_MEDIA share_media) {
        ToastUtil.TextToast(context,share_media+context.getString(R.string.tip_share_cancel));
    }
}
