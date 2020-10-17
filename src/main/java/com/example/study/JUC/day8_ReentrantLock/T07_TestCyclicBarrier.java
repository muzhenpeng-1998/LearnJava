package com.example.study.JUC.day8_ReentrantLock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class T07_TestCyclicBarrier {
    public static void main(String[] args) {
        //CyclicBarrier barrier = new CyclicBarrier(20);
        //够20个线程了 才执行操作
        CyclicBarrier barrier = new CyclicBarrier(20, () -> System.out.println("满人 发车"));

        /*CyclicBarrier barrier = new CyclicBarrier(20, new Runnable() {
            @Override
            public void run() {
                System.out.println("满人 发车");
            }
        });*/

        for(int i=0; i<20; i++) {

                new Thread(()->{
                    try {
                        barrier.await();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }).start();
            
        }
    }
}
