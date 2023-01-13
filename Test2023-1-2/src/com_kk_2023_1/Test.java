package com_kk_2023_1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Kk> kks = new ArrayList<Kk>();

        Kk kk = new Kk(22,"张坤峰");
        Kk kk1 = new Kk(23,"kk");
        kks.add(kk);//将对象存到集合内，所以集合内是对象
        kks.add(kk1);
        for(int i=0;i<kks.size();i++){
            Kk s=kks.get(i);//kks.get(i)这里到的是集合内的对象，然后将对象赋给kk s，通过s对象来调用Kk类中的get（）、set()方法获得数据

            System.out.println(s.getName()+", "+s.getAge());
        }


    }
}
