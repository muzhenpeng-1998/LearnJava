package com.example.DesignPatterns.StrategyPattern.T01;

/**
 * @author m
 * I'm glad to share my knowledge with you all.
 * 孙夫人断后，挡住追兵
 */
public class BlockEnemy implements IStrategy{
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }

    @Override
    public void eat() {
        System.out.println("BlockEnemy ....");
    }
}
