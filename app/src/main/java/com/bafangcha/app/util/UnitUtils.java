package com.bafangcha.app.util;

import android.content.Context;
import android.util.TypedValue;

/**
 * Author: Created by wenjundu
 * Date:on 2016/7/12
 * Description:
 */
public class UnitUtils {

        public static int dp2px(Context context, float dpValue) {
            final float scale = context.getResources().getDisplayMetrics().density;
            return (int) (dpValue * scale + 0.5f);
        }
         public static float sp2px(Context context,float sp) {
            return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp,
                context.getResources().getDisplayMetrics());
    }
}
