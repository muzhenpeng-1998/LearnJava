package com.example.study.Thread.day4_Volatile;

import java.util.concurrent.TimeUnit;

/**
 * @author nameM
 */
public class T01_HelloVolatile {

    /**
     * volatile作用：
     * 1. 线程间可见性
     * 2. 防止指令重排
     */
    //对比一下有无volatile的情况下，整个程序运行结果的区别
    /*volatile*/ boolean running = true;
    void m() {
        System.out.println("m start");

        while(running) {

        }
        System.out.println("m end!");
    }

    public static void main(String[] args) {
        T01_HelloVolatile t = new T01_HelloVolatile();

        new Thread(t::m, "t1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("执行中...");
        t.running = false;
    }

}
