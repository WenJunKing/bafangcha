package com.bafangcha.app.util;

import android.content.Context;

/**
 * Author: Created by wenjundu
 * Date:on 2016/7/12
 * Description:
 */
public class UnitUtils {

        public static int dip2px(Context context, float dpValue) {
            final float scale = context.getResources().getDisplayMetrics().density;
            return (int) (dpValue * scale + 0.5f);
        }
}
