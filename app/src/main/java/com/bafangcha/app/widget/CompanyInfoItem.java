package com.bafangcha.app.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bafangcha.app.R;

/**
 * Author: Created by wenjundu
 * Date:on 2016/7/13
 * Description:公司信息index页 图标按钮View
 */
public class CompanyInfoItem extends LinearLayout {

    private ImageView titleIV;
    private TextView titleTV;
    private TextView explainTV;
    private Drawable nodataDrawable,hasdataDrawable;
    private String title,explain;

    private final int NODATEXTCOLOR=0xff999999;
    private final int HASDATATITLECOLOR=0xff666666;
    private final int HASDATAEXPLAINCOLOR=0xff257DC8;

    private boolean hasData=true;
    public CompanyInfoItem(Context context) {
        this(context, null);
    }

    public CompanyInfoItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CompanyInfoItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.obtainStyledAttributes(attrs,
                R.styleable.CompanyInfoItem, defStyleAttr, 0);
        nodataDrawable=a.getDrawable(R.styleable.CompanyInfoItem_no_data_title_iv);
        hasdataDrawable=a.getDrawable(R.styleable.CompanyInfoItem_has_data_title_iv);
        title=a.getString(R.styleable.CompanyInfoItem_title_tv);
        explain=a.getString(R.styleable.CompanyInfoItem_explain_text);
        hasData=a.getBoolean(R.styleable.CompanyInfoItem_has_data,true);
        init();
    }

    private void init() {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.view_company_info_item, this,
                true);
        titleIV= (ImageView) view.findViewById(R.id.item_title_iv);
        titleTV= (TextView) view.findViewById(R.id.item_title_tv);
        explainTV= (TextView) view.findViewById(R.id.item_explain_tv);
        if(hasData)
            showHasDataView();
        else
            showNoDataView();
    }

    public void showHasDataView() {
        if(hasdataDrawable!=null)
            titleIV.setImageDrawable(hasdataDrawable);
        if(title!=null)
            titleTV.setTextColor(HASDATATITLECOLOR);
            titleTV.setText(title);
        if(explain!=null)
            explainTV.setTextColor(HASDATAEXPLAINCOLOR);
            explainTV.setText(explain);
    }
    public void showNoDataView(){
        if(nodataDrawable!=null)
            titleIV.setImageDrawable(nodataDrawable);
        if(title!=null)
            titleTV.setTextColor(NODATEXTCOLOR);
            titleTV.setText(title);
        if(explain!=null)
            explainTV.setTextColor(NODATEXTCOLOR);
            explainTV.setText(explain);
    }


}
