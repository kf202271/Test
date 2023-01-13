package com_kk_2023_1_5_2;

public class Student {
    private int age;
    private String name;

    public Student() {
    }

    public Student(int age, String name) {
        System.out.println("name" + name + "," + "age" + age);
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(name + ',' + age);
    }
}
