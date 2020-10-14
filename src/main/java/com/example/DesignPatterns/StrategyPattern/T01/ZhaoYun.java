package com.example.DesignPatterns.StrategyPattern.T01;

/**
 * @author nameM
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        //刚刚到吴国的时候拆第一个
        System.out.println("-----------刚刚到吴国的时候拆第一个-------------");
        //拿到妙计
        context = new Context(new BackDoor());
        context.operate(); //拆开执行
        //刘备乐不思蜀了，拆第二个了
        System.out.println("-----------刘备乐不思蜀了，拆第二个了-------------");
        context = new Context(new GivenGreenLight());
        //执行了第二个锦囊了
        context.operate();
        //孙权的小兵追了，咋办？拆第三个
        System.out.println("-----------孙权的小兵追了，咋办？拆第三个 -------------");
        context = new Context(new BlockEnemy());
        //孙夫人退兵
        context.operate();
        context.eat();
        context.play("孙夫人");

        /*
        *问题来了：赵云实际不知道是那个策略呀，他只知道拆第一个锦囊，
        *而不知道是BackDoor这个妙计，咋办？ 似乎这个策略模式已经把计谋名称写出来了
        *
        * 错！ BackDoor、 GivenGreenLight、 BlockEnemy只是一个代码，你写成first、 second、
        third，没人会说你错!
        *
        * 策略模式的好处就是：体现了高内聚低耦合的特性呀，缺点嘛，这个那个，我回去再查查
        */
    }
}
