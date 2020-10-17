package com.example.DesignPatterns.AbstractFactory.T01.Impl;

import com.example.DesignPatterns.AbstractFactory.T01.Abstract.AbstractYellowHuman;

/**
 * @author nameM
 */
public class YellowMaleHuman extends AbstractYellowHuman {
    /**
     * //定义性别
     */
    @Override
    public void sex() {
        System.out.println("该黄种人的性别为男...");
    }
}
