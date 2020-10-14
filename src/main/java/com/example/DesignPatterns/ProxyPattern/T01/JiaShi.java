package com.example.DesignPatterns.ProxyPattern.T01;

public class JiaShi implements KindWomen{
    /**
     * //这种类型的女人能做什么事情呢？
     */
    @Override
    public void makeEyesWithMan() {
        System.out.println("贾氏 make love ....");
    }

    /**
     * //happy what? You know that
     */
    @Override
    public void happyWithMan() {
        System.out.println("贾氏 happy with man...." );
    }
}
