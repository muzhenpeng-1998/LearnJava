package com.example.DesignPatterns.AbstractFactory.T01.Enum;

public enum HumanEnum {
    //把世界上所有人类型都定义出来
    YelloMaleHuman("com.example.DesignPatterns.AbstractFactory.T01.Impl.YellowMaleHuman"),
    YelloFemaleHuman("com.example.DesignPatterns.AbstractFactory.T01.Impl.YellowFemaleHuman"),
    WhiteFemaleHuman("com.example.DesignPatterns.AbstractFactory.T01.Impl.WhiteFemaleHuman"),
    WhiteMaleHuman("com.example.DesignPatterns.AbstractFactory.T01.Impl.WhiteMaleHuman"),
    BlackFemaleHuman("com.example.DesignPatterns.AbstractFactory.T01.Impl.BlackFemaleHuman"),
    BlackMaleHuman("com.example.DesignPatterns.AbstractFactory.T01.Impl.BlackMaleHuman");
    private String value = "";
    //定义构造函数，目的是Data(value)类型的相匹配
    private HumanEnum(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
    /*
     * java enum类型尽量简单使用，尽量不要使用多态、继承等方法
     * 毕竟用Clas完全可以代替enum
     */
}
