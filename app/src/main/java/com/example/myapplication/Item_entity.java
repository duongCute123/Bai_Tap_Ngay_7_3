package com.example.myapplication;

import java.lang.reflect.Constructor;

public class Item_entity {
    private String name;
    private String shop_name;
    private  int img;

    public Item_entity(String name, String shop_name, int img) {
        this.name = name;
        this.shop_name = shop_name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
