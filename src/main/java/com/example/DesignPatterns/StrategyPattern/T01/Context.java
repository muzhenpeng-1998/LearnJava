package com.example.DesignPatterns.StrategyPattern.T01;

/**
 * @author m
 * I'm glad to share my knowledge with you all.
 * 计谋有了，那还要有锦囊
 */
public class Context {

    //构造函数，你要使用那个妙计
    private IStrategy straegy;

    public Context(IStrategy strategy){
        this.straegy = strategy;
    }
    //使用计谋了，看我出招了
    public void operate(){
        this.straegy.operate();
    }

    public void eat(){
        this.straegy.eat();
    }

    public void play(String name){
        this.straegy.play(name);
    }

}
