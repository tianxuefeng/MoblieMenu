package com.aptsys.android.fragments;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.aptsys.android.R;

import com.aptsys.android.data.entity.Category;

import java.util.List;

public class CategoryArrayAdapter extends ArrayAdapter<Category> {

    private Context context;
    private List<Category> objects;

    public CategoryArrayAdapter(Context context, int resource, List<Category> objects) {
        super(context, resource, objects);
        this.context = context;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Category CategoryEntity = objects.get(position);

        LayoutInflater inflater =
                (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.flower_listitem, null);

//		ImageView image = (ImageView) view.findViewById(R.id.ivFlowerImage);
//		image.setImageResource(Flower.getImageResource());

        TextView tv = (TextView) view.findViewById(R.id.tvFlowerName);

        tv.setText(CategoryEntity.toString());

        return view;
    }

}
