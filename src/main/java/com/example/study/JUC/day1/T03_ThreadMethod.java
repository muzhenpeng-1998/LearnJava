package com.example.study.JUC.day1;

/**
 * @author nameM
 * 线程的几个方法
 */
public class T03_ThreadMethod {
    public static void main(String[] args) {
//        testSleep();
        testYield();
//        testJoin();
    }

    /**
     * 睡一会
     */
    static void testSleep(){
        new Thread(()->{
            for(int i=0; i<100; i++){
                System.out.println("A"+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    /**
     * 停止下来进入等待队列
     */
    static void testYield(){
        new Thread(()->{
            for(int i=0; i<100; i++){
                System.out.println("A"+i);
                if(i%10 == 0){
                    Thread.yield();
                }
            }
        }).start();

        new Thread(()->{
            for(int i=0; i<100; i++){
                System.out.println("---B---"+i);
                if(i%10 == 0){
                    Thread.yield();
                }
            }
        }).start();
    }

    /**
     * 在当前线程加入你调用join的线程，本线程等待
     */
    static void testJoin() {
        Thread t1 = new Thread(()->{
            for(int i=0; i<5; i++) {
                System.out.println("B" + i);
                try {
                    Thread.sleep(500);
                    //TimeUnit.Milliseconds.sleep(500)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(()->{

            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for(int i=0; i<10; i++) {
                System.out.println("A" + i);
                try {
                    Thread.sleep(500);
                    //TimeUnit.Milliseconds.sleep(500)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
