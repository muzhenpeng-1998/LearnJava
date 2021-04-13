package com.example.study.Thread.mianshi;

public class Singleton {

    //volatile是防止指令重排
    private static volatile Singleton singleton;
    private Singleton() {}

    public static Singleton getInstance() {
        //第一层判断singleton是不是为null //如果不为null直接返回，这样就不必加锁了
        if (singleton == null) {
            //现在再加锁
            synchronized (Singleton.class) {
                //第二层判断
                //如果A,B两个线程都在synchronized等待
                // A创建完对象之后，B还会再进入，如果不再检查一遍，B又会创建一个对象
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
