package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    GridView list_grid;
    ArrayList<Item_grid_entity> item_grid_entities;
    Item_grid_util item_grid_util;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        list_grid=findViewById(R.id.list_grid);
        item_grid_entities =new ArrayList<>();
        item_grid_entities.add(new Item_grid_entity("Cáp chuyển từ cổng USB sang PS2",3,69000,
                20,R.drawable.carbusbtops2_1,39));
        item_grid_entities.add(new Item_grid_entity("Cáp chuyển từ cổng USB sang PS2",3,69000,
                20,R.drawable.daucam_1,39));
        item_grid_entities.add(new Item_grid_entity("Cáp chuyển từ cổng USB sang PS2",3,69000,
                20,R.drawable.dauchuyendoi_1,39));
        item_grid_entities.add(new Item_grid_entity("Cáp chuyển từ cổng USB sang PS2",3,69000,
                20,R.drawable.dauchuyendoipsps2_1,39));
        item_grid_entities.add(new Item_grid_entity("Cáp chuyển từ cổng USB sang PS2",3,69000,
                20,R.drawable.daynguon_1,39));
        item_grid_entities.add(new Item_grid_entity("Cáp chuyển từ cổng USB sang PS2",3,69000,
                20,R.drawable.giacchuyen_1,39));

        item_grid_util=new Item_grid_util(this,R.layout.customer_grid_view,item_grid_entities);
        list_grid.setAdapter(item_grid_util);

    }
}