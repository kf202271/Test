package com_kk_2022_1_4;

public class Phone {
    String brand = "小米";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    int price = 1400;

    public void call() {

        System.out.println("打电话");
    }
}
