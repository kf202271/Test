package com_kk_2023_1_13_1;

public class TestDome {
    public static void main(String[] args) {
        Box box = new Box();
        Producer producer = new Producer(box);
        Customer customer = new Customer(box);
        Thread ti = new Thread(producer);
        Thread t2 = new Thread(customer);
        ti.start();
        t2.start();
    }
}
