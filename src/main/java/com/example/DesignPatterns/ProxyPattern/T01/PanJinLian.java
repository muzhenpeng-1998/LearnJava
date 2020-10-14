package com.example.DesignPatterns.ProxyPattern.T01;
/**
 * @author m
 * I'm glad to share my knowledge with you all.
 * 定一个潘金莲是什么样的人
 */
public class PanJinLian implements KindWomen{
    /**
     * //这种类型的女人能做什么事情呢？
     */
    @Override
    public void makeEyesWithMan() {
        System.out.println("潘金莲在和男人做那个.....");
    }

    /**
     * //happy what? You know that
     */
    @Override
    public void happyWithMan() {
        System.out.println("潘金莲抛媚眼");
    }
}
