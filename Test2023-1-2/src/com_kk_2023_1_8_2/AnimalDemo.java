package com_kk_2023_1_8_2;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping J=new Cat();
        J.jump();
        Cat cat = new Cat();
        cat.jump();
        cat.show();
        cat.setAge(25);
        cat.setName("你好");
        System.out.println(cat.getAge());
        Animal A = new Cat();
        A.show();
        ((Cat)A).jump();
    }
}
