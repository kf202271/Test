package com_kk_2023_1_6_1;

public class Student {
    private String name;
    private  String age;
    private  String id;
    private  String address;

    public Student(String name, String age, String id, String address) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
