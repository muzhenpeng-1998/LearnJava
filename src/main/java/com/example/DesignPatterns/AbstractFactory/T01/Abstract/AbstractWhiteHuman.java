package com.example.DesignPatterns.AbstractFactory.T01.Abstract;

import com.example.DesignPatterns.AbstractFactory.T01.Human;

/**
 * @author m
 * I'm glad to share my knowledge with you all.
 * 为什么要修改成抽象类呢？要定义性别呀
 */
public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void cry() {
        System.out.println("白色人类会哭");
    }
    @Override
    public void laugh() {
        System.out.println("白色人类会大笑，侵略的笑声！ ");
    }
    @Override
    public void talk() {
        System.out.println("白色人类会说话，一般都是但是单字节！");
    }
}
