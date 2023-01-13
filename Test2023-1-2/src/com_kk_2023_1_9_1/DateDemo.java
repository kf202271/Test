package com_kk_2023_1_9_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String s=simpleDateFormat.format(date);
        System.out.println(s);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        String z=dateFormat.format(date);
        System.out.println(z);
        String ss="2023-08-09 11:11:11";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d=format.parse(ss);
        System.out.println(d);
        Calendar instance = Calendar.getInstance();
    }

}
