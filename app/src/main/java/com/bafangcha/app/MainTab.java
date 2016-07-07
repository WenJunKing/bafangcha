package com.bafangcha.app;

import com.bafangcha.app.fragment.AttentionFragment;
import com.bafangcha.app.fragment.FindFragment;
import com.bafangcha.app.fragment.HomeFragment;
import com.bafangcha.app.fragment.MyselfFragment;

public enum MainTab {

	/*
	NEWS(0, R.string.main_tab_name_news, R.drawable.tab_icon_new,
			NewsViewPagerFragment.class),
			*/

    HOME(0, R.string.main_tab_name_home, R.drawable.tab_icon_home,
            HomeFragment.class),

    ATTENTION(1, R.string.main_tab_name_attention, R.drawable.tab_icon_attention,
            AttentionFragment.class),

    FIND(2, R.string.main_tab_name_find, R.drawable.tab_icon_find,
            FindFragment.class),

    MYSELF(3, R.string.main_tab_name_me, R.drawable.tab_icon_me,
            MyselfFragment.class);


    private int idx;
    private int resName;
    private int resIcon;
    private Class<?> clz;

    private MainTab(int idx, int resName, int resIcon, Class<?> clz) {
        this.idx = idx;
        this.resName = resName;
        this.resIcon = resIcon;
        this.clz = clz;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getResName() {
        return resName;
    }

    public void setResName(int resName) {
        this.resName = resName;
    }

    public int getResIcon() {
        return resIcon;
    }

    public void setResIcon(int resIcon) {
        this.resIcon = resIcon;
    }

    public Class<?> getClz() {
        return clz;
    }

    public void setClz(Class<?> clz) {
        this.clz = clz;
    }
}
