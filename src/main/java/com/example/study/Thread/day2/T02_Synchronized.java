package com.example.study.Thread.day2;

/**
 * @author nameM
 * 加锁
 */
public class T02_Synchronized {

    private int count = 10;

    public void m() {
        //任何线程要执行下面的代码，必须先拿到this的锁
        synchronized(this) {
            count--;
            System.out.println(Thread.currentThread().getName() + " count = " + count);
        }
    }
}
