package com.bafangcha.app.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Toast;

import com.bafangcha.app.R;
import com.bafangcha.app.ui.EnterpriseIndexActivity;
import com.bafangcha.app.widget.CircleProgressBar;
import com.bafangcha.app.widget.ProgressBarView;
import com.bafangcha.app.widget.SystemBarHelper;
import com.bafangcha.app.widget.linearlistview.LinearListView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Author: Created by wenjundu
 * Date:on 2016/7/7
 * Description:
 */
public class HomeFragment extends Fragment {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.hot_enterprise_list)
    LinearListView hotEnterpriseLV;
    @BindView(R.id.news_enterprise_list)
    LinearListView newsEnterpriseLV;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,null);
        ButterKnife.bind(this,view);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        SystemBarHelper.immersiveStatusBar(getActivity());
        SystemBarHelper.setHeightAndPadding(getActivity(), mToolbar);
        //SystemBarHelper.tintStatusBar(getActivity(), getResources().getColor(R.color.colorPrimary));

        HotAdapter hotAdapter=new HotAdapter(getContext());
        hotEnterpriseLV.setAdapter(hotAdapter);
        NewsAdapter newsAdapter=new NewsAdapter(getContext());
        newsEnterpriseLV.setAdapter(newsAdapter);

        hotEnterpriseLV.setOnItemClickListener(new LinearListView.OnItemClickListener() {
            @Override
            public void onItemClick(LinearListView parent, View view, int position, long id) {
                Intent intent=new Intent(getContext(), EnterpriseIndexActivity.class);
                startActivity(intent);
            }
        });

    }
    class HotAdapter extends BaseAdapter{
        private LayoutInflater inflater;
        public HotAdapter(Context context){
            inflater=LayoutInflater.from(context);
        }
        @Override
        public int getCount() {
            return 2;
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
            CircleProgressBar progressBarView=null;
            if (convertView == null) {
                convertView = inflater.inflate(R.layout.item_hot_enterprise_list, parent, false);
                progressBarView= (CircleProgressBar) convertView.findViewById(R.id.heat_progress);
                progressBarView.setMax(1000);
                progressBarView.setProgress(800);
            }

            return convertView;
        }
    }
    class NewsAdapter extends BaseAdapter{
        private LayoutInflater inflater;
        public NewsAdapter(Context context){
            inflater=LayoutInflater.from(context);
        }
        @Override
        public int getCount() {
            return 2;
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
            if (convertView == null) {
                convertView = inflater.inflate(R.layout.item_news_enterprise_list, parent, false);

            }
            return convertView;
        }
    }
}
