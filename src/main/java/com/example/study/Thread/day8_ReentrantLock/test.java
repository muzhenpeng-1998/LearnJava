package com.example.study.Thread.day8_ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class test {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
    }
}
