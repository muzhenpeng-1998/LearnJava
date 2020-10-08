package com.example.study.Thread.day1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @author nameM
 * 创建线程的三种方式
 */
public class T02_HowToCreateTread {

    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("Hello MyThread!");
        }
    }

    static class MyRun implements Runnable{

        @Override
        public void run() {
            System.out.println("Hello MyRun!");
        }
    }

    static class MyCall implements Callable<String>{

        @Override
        public String call() throws Exception {
            System.out.println("Hello MyCall!");
            return "success";
        }
    }

    public static void main(String[] args) {
        //1.new Thread().start()
        new MyThread().start();
        //2.new Thread(Runnable).start()
        new Thread(new MyRun()).start();
        new Thread(()->{
            System.out.println("Hello lambda!");
        }).start();

        //3.创建线程池
        Thread t = new Thread(new FutureTask<String>(new MyCall()));
        t.start();

        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(()->{
            System.out.println("Hello ThreadPool");
        });
        service.shutdown();
    }
}
