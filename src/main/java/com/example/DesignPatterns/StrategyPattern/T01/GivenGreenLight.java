package com.example.DesignPatterns.StrategyPattern.T01;

/**
 * @author m
 * I'm glad to share my knowledge with you all.
 * 求吴国太开个绿灯
 */
public class GivenGreenLight implements IStrategy{
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行！ ");
    }

    @Override
    public void eat() {
        System.out.println("GivenGreenLight ...");
    }
}
