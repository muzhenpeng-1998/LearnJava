package com.example.DesignPatterns.AbstractFactory.T01.Factory;

import com.example.DesignPatterns.AbstractFactory.T01.Human;

public interface HumanFactory {

    /**
     * //制造黄色人类
     * @return
     */
    Human createYellowHuman();
    /**
     * //制造一个白色人类
     * @return
     */
    Human createWhiteHuman();

    /**
     * //制造一个黑色人类
     * @return
     */
    Human createBlackHuman();
}
