package com.example.study.Thread.day2;

public class T04 {
    private static int count = 10;

    synchronized static void m(){
        count -- ;
        System.out.println(Thread.currentThread().getName() + "COUNT = " + count);
    }
    static void mm(){
        synchronized (T04.class){
            count --;
        }
    }

    public static void main(String[] args) {
        mm();
    }
}
