package com.example.fragmentgame.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;



import com.example.fragmentgame.R;


import java.util.List;

public class Adapter extends BaseAdapter {

    List<Integer> list ;
    Context context;

    public Adapter(Context context , List<Integer> list) {
        this.list = list;
        this.context = context;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        if(view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_items, viewGroup, false);
        }
        ImageView imageView = view.findViewById(R.id.imageView);

        imageView.setImageResource(list.get(i));

        //Picasso.with(context).load(list.get(i)).into(imageView);

        return imageView;

        /*TextView dummyTextView = new TextView(mContext);
        dummyTextView.setText(String.valueOf(position));
        return dummyTextView;*/
    }
}
