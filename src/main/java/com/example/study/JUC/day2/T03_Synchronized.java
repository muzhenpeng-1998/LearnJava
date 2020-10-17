package com.example.study.JUC.day2;

/**
 * @author nameM
 */
public class T03_Synchronized implements Runnable{

    private /*volatile*/ int count = 100;

    @Override
    public /*synchronized*/ void run() {
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }

    public static void main(String[] args) {
        T03_Synchronized t = new T03_Synchronized();
        for(int i=0; i<100; i++) {
            new Thread(t, "THREAD" + i).start();
        }
    }
}
