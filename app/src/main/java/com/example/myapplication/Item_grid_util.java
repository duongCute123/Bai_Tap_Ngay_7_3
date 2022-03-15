package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class Item_grid_util extends BaseAdapter {
    Context context;
    int lay_out;
    ArrayList<Item_grid_entity> item_grid_entities;

    public Item_grid_util(Context context, int lay_out, ArrayList<Item_grid_entity> item_grid_entities) {
        this.context = context;
        this.lay_out = lay_out;
        this.item_grid_entities = item_grid_entities;
    }

    @Override
    public int getCount() {
        return item_grid_entities.size();
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
        ViewHolder viewHolder;
        if (view==null){
            view= LayoutInflater.from(context).inflate(lay_out,viewGroup,false);
            viewHolder=new ViewHolder();
            viewHolder.txtTen=view.findViewById(R.id.txtTen);
            viewHolder.txtRate=view.findViewById(R.id.txtRate);
            viewHolder.money=view.findViewById(R.id.money);
            viewHolder.num=view.findViewById(R.id.num);
            viewHolder.redue=view.findViewById(R.id.redue);
            viewHolder.grid_img=view.findViewById(R.id.grid_img);
            
            view.setTag(viewHolder);
        }
        else {
            viewHolder=(ViewHolder) view.getTag();
        }
        viewHolder.txtTen.setText(item_grid_entities.get(i).getTen());
        viewHolder.money.setText(item_grid_entities.get(i).getPrice());
        viewHolder.num.setText(item_grid_entities.get(i).getPeople());
        viewHolder.redue.setText(item_grid_entities.get(i).getReduce());
        viewHolder.grid_img.setImageResource(item_grid_entities.get(i).getGrid_img());
        viewHolder.txtRate.setText(item_grid_entities.get(i).getRate());




        return view;
    }
    private  class ViewHolder{
        TextView txtTen;
        RatingBar txtRate;
        TextView money;
        TextView num;
        TextView redue;
        ImageView grid_img;
    }
}
