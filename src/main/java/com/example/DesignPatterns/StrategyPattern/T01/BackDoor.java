package com.example.DesignPatterns.StrategyPattern.T01;

/**
 * @author m
 * I'm glad to share my knowledge with you all.
 * 找乔国老帮忙，使孙权不能杀刘备
 */
public class BackDoor implements IStrategy{
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }

    @Override
    public void eat() {
        System.out.println("BackDoor .....");
    }
}
