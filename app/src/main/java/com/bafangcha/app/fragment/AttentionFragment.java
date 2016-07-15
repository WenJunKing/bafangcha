package com.bafangcha.app.fragment;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.bafangcha.app.R;
import com.bafangcha.app.util.UnitUtils;
import com.bafangcha.app.widget.SystemBarHelper;
import com.bafangcha.app.widget.swipemenulistview.SwipeMenu;
import com.bafangcha.app.widget.swipemenulistview.SwipeMenuCreator;
import com.bafangcha.app.widget.swipemenulistview.SwipeMenuItem;
import com.bafangcha.app.widget.swipemenulistview.SwipeMenuListView;

import butterknife.BindView;

/**
 * Author: Created by wenjundu
 * Date:on 2016/7/7
 * Description:
 */
public class AttentionFragment extends ABaseFragment {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.title_tv)
    TextView titleTV;
    @BindView(R.id.my_attention_list)
    SwipeMenuListView swipeMenuListView;

    MyAttentionAdapter myAttentionAdapter;

    @Override
    protected int inflateContentView() {
        return R.layout.fragment_attention;
    }


    @Override
    protected void initWidget(View root) {
        SystemBarHelper.immersiveStatusBar(getActivity());
        SystemBarHelper.setHeightAndPadding(getActivity(), toolbar);
        toolbar.setTitle("");
        titleTV.setText("关注");

        configSwipe();
    }

    private void configSwipe() {
        SwipeMenuCreator creator = new SwipeMenuCreator() {

            @Override
            public void create(SwipeMenu menu) {
                // create "delete" item
                SwipeMenuItem deleteItem = new SwipeMenuItem(
                        getContext());
                // set item background
                deleteItem.setBackground(new ColorDrawable(ContextCompat.getColor(getContext(), R.color.red)));
                // set item width
                deleteItem.setWidth(UnitUtils.dp2px(getContext(), 60));
                // set a icon
                deleteItem.setIcon(R.mipmap.collect_item_delete);
                // add to menu
                menu.addMenuItem(deleteItem);
            }
        };
        swipeMenuListView.setMenuCreator(creator);
    }

    @Override
    protected void initData() {
        myAttentionAdapter=new MyAttentionAdapter();
        swipeMenuListView.setAdapter(myAttentionAdapter);
        swipeMenuListView.setOnMenuItemClickListener(new SwipeMenuListView.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(int position, SwipeMenu menu, int index) {

                switch (index) {
                    case 0:
                        //执行删除操作
                        Toast.makeText(getContext(),"删除了",Toast.LENGTH_SHORT).show();
                        break;

                }
                return false;
            }
        });
    }

    class MyAttentionAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            return  View.inflate(getContext(),
                    R.layout.item_my_attention_list, null);
        }
    }
}
