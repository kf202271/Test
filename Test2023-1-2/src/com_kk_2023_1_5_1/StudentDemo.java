package com_kk_2023_1_5_1;

public class StudentDemo {
    public static void main(String[]args){
        Student s = new Student();
        s.setAge(20);
        s.setName("张坤峰");
        new Student();
        System.out.println(s.getAge());
        System.out.println(s.getName());
    }

}
