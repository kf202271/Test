package com_kk_2023_1_13_1;

public class Producer implements Runnable{
    private Box B;
    public Producer(Box box) {
        this.B=box;

    }

    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            B.put(i);
        }

}
}
