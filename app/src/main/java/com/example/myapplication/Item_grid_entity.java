package com.example.myapplication;

public class Item_grid_entity {
    private String Ten;
    private int rate;
    private int price;
    private int people;
    private  int grid_img;
    private  int reduce;

    public Item_grid_entity(String ten, int rate, int price, int people, int grid_img, int reduce) {
        Ten = ten;
        this.rate = rate;
        this.price = price;
        this.people = people;
        this.grid_img = grid_img;
        this.reduce = reduce;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getGrid_img() {
        return grid_img;
    }

    public void setGrid_img(int grid_img) {
        this.grid_img = grid_img;
    }

    public int getReduce() {
        return reduce;
    }

    public void setReduce(int reduce) {
        this.reduce = reduce;
    }
}
