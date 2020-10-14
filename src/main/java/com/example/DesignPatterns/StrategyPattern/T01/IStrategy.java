package com.example.DesignPatterns.StrategyPattern.T01;

/**
 * @author m
 * I'm glad to share my knowledge with you all.
 * 首先定一个策略接口，这是诸葛亮老人家给赵云的三个锦囊妙计的接口
 *
 */
public interface IStrategy {

    //每个锦囊妙计都是一个可执行的算法
    void operate();

    void eat();

    default void play(String name){
        System.out.println(name + "paly");
    }
}
