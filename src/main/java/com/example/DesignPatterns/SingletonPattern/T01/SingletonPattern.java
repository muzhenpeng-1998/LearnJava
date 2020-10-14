package com.example.DesignPatterns.SingletonPattern.T01;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 通用单例模式
 */
@SuppressWarnings("all")
public class SingletonPattern {

    private static final SingletonPattern singletonPattern= new SingletonPattern();
    //限制住不能直接产生一个实例
    private SingletonPattern(){
    }
    public synchronized static SingletonPattern getInstance(){
        return singletonPattern;
    }
}
