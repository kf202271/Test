package com_kk_2023_1_13_1;

public class Customer implements Runnable {
    private Box box;

    public Customer(Box box) {
        this.box = box;
    }


    @Override
    public void run() {
        while (true) {
            box.get();
        }
    }
}

