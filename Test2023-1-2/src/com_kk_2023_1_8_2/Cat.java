package com_kk_2023_1_8_2;

public class Cat extends Animal implements Jumpping,kk {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void show() {
        System.out.println("猫吃鱼");

    }

    @Override
    public void jump() {
        System.out.println("猫可以跳高了");

    }
}
