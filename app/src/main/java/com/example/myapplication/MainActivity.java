package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list_view;
    Item_list_util util;
    ArrayList<Item_entity> item_entities;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list_view=findViewById(R.id.list_view);
        item_entities=new ArrayList<>();
        item_entities.add(new Item_entity("Ca nấu lẩu,nấu mì mini..",
                "Shop deva",R.drawable.ca_nau_lau));
        item_entities.add(new Item_entity("1 KG khô gà bơ tỏi..",
                "Shop LTD",R.drawable.ga_bo_toi));
        item_entities.add(new Item_entity("Xe cần cẩu đa năng",
                "Shop Thế giới đồ chơi",R.drawable.xa_can_cau));
        item_entities.add(new Item_entity("Đồ chơi mô hình",
                "Shop Thế giới đồ chơi",R.drawable.do_choi_dang_mo_hinh));
        item_entities.add(new Item_entity("Lãnh đạo giản đơn",
                "Shop Minh Long Book",R.drawable.lanh_dao_gian_don));
        item_entities.add(new Item_entity("Hiểu lòng con trẻ",
                "Shop Minh Long Book",R.drawable.hieu_long_con_tre));

        util=new Item_list_util(this,R.layout.customer_list_view,item_entities);
        list_view.setAdapter(util);

    }
}