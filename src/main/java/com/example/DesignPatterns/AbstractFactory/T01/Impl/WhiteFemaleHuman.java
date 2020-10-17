package com.example.DesignPatterns.AbstractFactory.T01.Impl;

import com.example.DesignPatterns.AbstractFactory.T01.Abstract.AbstractWhiteHuman;
import com.example.DesignPatterns.AbstractFactory.T01.Abstract.AbstractYellowHuman;

/**
 * @author nameM
 */
public class WhiteFemaleHuman extends AbstractWhiteHuman {
    /**
     * //定义性别
     */
    @Override
    public void sex() {
        System.out.println("该白种人的性别为女...");
    }
}
