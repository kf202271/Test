package com_kk_2023_1_13_1;

public class Box {
    private int milk;
    private boolean state = false;//

    public synchronized void put(int milk) {
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("送奶工将" + this.milk + "放入");
        state = true;
        notifyAll();
    }

    public synchronized void get() {
        if (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户拿到" + this.milk);
        state = false;
        notifyAll();
    }
}
