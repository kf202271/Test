package com_kk_2023_1_5_1;

public class Student {
    private int age;
    private String name;
    public int getAge(){
        return age;
    }
    public void setAge(int age1){
        age=age1;
    }
    public String getName(){
        return name;

    }
    public void setName(String name1){
        name =name1;
    }
    public Student(){
        System.out.println("你好");
    }
}
