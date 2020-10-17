package com.example.DesignPatterns.FactoryMethodPattern.T01;

public class WhiteHuman implements Human{
    /**
     * 人是愉快的，会笑的，本来是想用smile表示，想了一下laugh更合适，好长时间没有大笑了；
     */
    @Override
    public void laugh() {
        System.out.println("白种人 笑。。。。。。。");

    }

    /**
     * 人类还会哭，代表痛苦
     */
    @Override
    public void cry() {
        System.out.println("白种人 哭。。。。。。。");
    }

    /**
     * 人类会说话
     */
    @Override
    public void talk() {
        System.out.println("白种人 说话。。。。。。。");
    }
}
