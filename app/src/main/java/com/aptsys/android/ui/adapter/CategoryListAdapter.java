package com.aptsys.android.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.aptsys.android.R;
import com.aptsys.android.data.entity.Category;

import java.util.List;

/**
 * CategoryListAdapter
 *
 * @author 日期：2014-7-21下午04:08:11
 * @author 作者：岩鹰
 * @author 邮箱：jyanying@163.com
 * @author (C) Copyright 岩鹰 Corporation 2014 - 2024
 *         All Rights Reserved.
 * @version 0.1
 **/
public class CategoryListAdapter extends BaseAdapter {

    private List<Category> list;
    private LayoutInflater layoutInflater;

    private Tag tag;

    public CategoryListAdapter(Context context, List<Category> list) {
        layoutInflater = LayoutInflater.from(context);
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.item_local, null);
            tag = new Tag();
            tag.labName = (TextView) convertView.findViewById(R.id.local_pro_name);

            convertView.setTag(tag);
        } else {
            tag = (Tag) convertView.getTag();
        }
        Category entity = list.get(position);
        String name = entity.toString();
        tag.labName.setText(name);
        return convertView;
    }

    protected class Tag {
        public TextView labName;
    }
}
