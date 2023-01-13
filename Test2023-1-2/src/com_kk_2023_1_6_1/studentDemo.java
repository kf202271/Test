package com_kk_2023_1_6_1;

import com_kk_2023_1_6_1.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class studentDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();


        boolean flag = true;
        while (flag) {
            System.out.println("欢迎来到管理系统");
            System.out.println("1：添加学生");
            System.out.println("2：查找学生");
            System.out.println("3：修改学生");
            System.out.println("4：修改学生");
            System.out.println("5：退出系统");
            System.out.println("--------------");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入操作选项");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    add(students);
                    break;
                case 2:
                    sort(students);
                    break;
                case 3:
                    change(students);
                    break;
                case 5:
                    flag = false;
                    System.out.println("谢谢使用");
                    break;
                default:
                    System.out.println("你输入的有误请重新输入");

            }

        }
    }

    public static void add(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("学号");
        String id = sc.nextLine();
        System.out.println("姓名");
        String name = sc.nextLine();
        System.out.println("地址");
        String aadderss = sc.nextLine();
        System.out.println("年龄");
        String age = sc.nextLine();
        Student s = new Student();
        s.setAge(age);
        s.setName(name);
        s.setId(id);
        s.setAddress(aadderss);
        arrayList.add(s);
        System.out.println("添加成功");
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println(student.getName() + "  " + student.getAge() + student.getAddress() + student.getId());
        }


    }

    public static void sort(ArrayList<Student> arr) {
        System.out.println("请输入查找的学生id");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            Student s = arr.get(i);
            if (id.equals(s.getId())) {
                System.out.println(s.getName());
                break;

            } else {
                System.out.println("无此学生");
            }
        }

    }

    public static void change(ArrayList<Student> arr) {
        System.out.println("请输入改变学生的学号");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            Student s = arr.get(i);
            if (id.equals(s.getId())) {
                System.out.println(s.getId() + "," + s.getName() + "," + s.getAddress());
                System.out.println("请输入你要修改什么信息");
                System.out.println("id");
                Student st = new Student();
                String id1 = scanner.nextLine();
                st.setId(id1);


                System.out.println(s.getId() + "," + s.getName() + "," + s.getAddress());
            }

        }
    }

    public void delete() {
    }

}
