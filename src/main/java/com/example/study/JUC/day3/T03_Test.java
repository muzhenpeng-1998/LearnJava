package com.example.study.JUC.day3;

import java.util.concurrent.TimeUnit;

/**
 * @author nameM
 */
public class T03_Test {

    synchronized void m1() {
        System.out.println("m1 start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m2();
        System.out.println("m1 end");
    }

    synchronized void m2() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m1();
        System.out.println("m2");
    }

    public static void main(String[] args) {
        new T03_Test().m1();
    }
}
