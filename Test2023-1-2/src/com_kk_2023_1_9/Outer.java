package com_kk_2023_1_9;

public class Outer {
    private  int age;
    public class inter{
        public void show(){
            System.out.println(age);

        }
    }
    public void method(){
        inter a=new inter();
        a.show();
                int []arr=new int [8];
        System.out.println(arr);
    }
}
