package com.example.DesignPatterns.AbstractFactory.T01.Factory;

import com.example.DesignPatterns.AbstractFactory.T01.Enum.HumanEnum;
import com.example.DesignPatterns.AbstractFactory.T01.Human;

/**
 * @author nameM
 */
public class FemaleHumanFactory extends AbstractHumanFactory{
    /**
     * //制造黄色人类
     *
     * @return
     */
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }

    /**
     * //制造一个白色人类
     *
     * @return
     */
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    /**
     * //制造一个黑色人类
     *
     * @return
     */
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.YelloFemaleHuman);
    }
}
