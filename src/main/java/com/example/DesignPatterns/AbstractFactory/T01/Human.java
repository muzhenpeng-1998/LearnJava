package com.example.DesignPatterns.AbstractFactory.T01;

/**
 * @author m
 * I'm glad to share my knowledge with you all.
 * 定义一个人类的统称，问题出来了，刚刚定义的时候忘记定义性别了
 * 这个重要的问题非修改不可，否则这个世界上太多太多的东西不存在了
 */
public interface Human {
    /**
     * //首先定义什么是人类
     *     //人是愉快的，会笑的，本来是想用smile表示，想了一下laugh更合适，好长时间没有大笑了；
     */
    void laugh();
    /**
     * //人类还会哭，代表痛苦
     */
    void cry();
    /**
     * //人类会说话
     */
    void talk();
    /**
     * //定义性别
     */
    void sex();
}
