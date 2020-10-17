package com.example.DesignPatterns.AbstractFactory.T01.Impl;

import com.example.DesignPatterns.AbstractFactory.T01.Abstract.AbstractBlackHuman;
import com.example.DesignPatterns.AbstractFactory.T01.Abstract.AbstractYellowHuman;

/**
 * @author nameM
 */
public class BlackFemaleHuman extends AbstractBlackHuman {
    /**
     * //定义性别
     */
    @Override
    public void sex() {
        System.out.println("该黑种人的性别为女...");
    }
}
