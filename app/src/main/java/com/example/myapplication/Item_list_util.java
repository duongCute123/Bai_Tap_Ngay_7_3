package com.example.myapplication;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Item_list_util extends BaseAdapter {
    Context context;
    int lay_Out;
    ArrayList<Item_entity> item_entities;

    public Item_list_util(Context context, int lay_Out, ArrayList<Item_entity> item_entities) {
        this.context = context;
        this.lay_Out = lay_Out;
        this.item_entities = item_entities;
    }

    @Override
    public int getCount() {
        return item_entities.size();
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
        view= LayoutInflater.from(context).inflate(lay_Out,viewGroup,false);
        TextView txtName=view.findViewById(R.id.txtName);
        TextView txtShop=view.findViewById(R.id.txtShop);
        ImageView img=view.findViewById(R.id.img);
        txtName.setText(item_entities.get(i).getName());
        txtShop.setText(item_entities.get(i).getName());
        img.setImageResource(item_entities.get(i).getImg());
        return view;
    }
}
