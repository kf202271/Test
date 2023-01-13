package com_kk_2023_1_9_2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ListDemo {
    public static void main(String[] args) throws IOException {

//        ArrayList<Student> a = new ArrayList<Student>();
//        Student student = new Student(23, "白");
//        Student studeng = new Student(25, "白");
//        a.add(student);
//        a.add(studeng);
//        for (int i = 0; i < a.size(); i++) {
//            Student s = a.get(i);
//            System.out.println(s.getAge() + s.getName());
//
//        }
//        for (Student A : a) {
//            System.out.println(A.getAge() + A.getName());
//        }
//        Iterator<Student> s = a.iterator();
//        while (s.hasNext()) {
//            Student student1 = s.next();
//            System.out.println(student1.getAge() + student1.getName());
//
//        }
//
//        LinkedList<Student> linkedList = new LinkedList<Student>();
//
//        Iterator<Student> ss = a.iterator();
//        while (ss.hasNext()) {
//    Student SSS=ss.next();
        ArrayList<Student> ayyay = new ArrayList<Student>();
        BufferedReader br = new BufferedReader(new FileReader("Test2023-1-2\\test.txt"));
        String line;
        while ((line=br.readLine())!=null){
            String[] sp = line.split(",");
            Student student = new Student();
//            System.out.println();
//            System.out.println(sp.toString());
            student.setName(sp[1]);
            System.out.println(sp.length);
            for (int i=0;i<sp.length;i++){
                student.setName(sp[i]);

            }
            System.out.println(student.getName());


        }

    }


}
