package com.example.study.Spring.AOP.day1;

import com.example.study.Spring.AOP.day1.myinter.MyInterface;
import com.example.study.Spring.AOP.day1.myinter.MySubClass;
import com.example.study.Spring.AOP.day1.proxy.CalculatorProxy;
import com.example.study.Spring.AOP.day1.service.Calculator;
import com.example.study.Spring.AOP.day1.service.MyCalculator;
import com.example.study.Spring.AOP.day1.service.SecondCalculator;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01() throws NoSuchMethodException {

//        MyCalculator myCalculator = new MyCalculator();
//        System.out.println(myCalculator.add(1, 2));
//        System.out.println(myCalculator.div(1, 1));

        Calculator calculator = (Calculator) CalculatorProxy.getProxy(new MyCalculator());
        System.out.println(calculator.add(1, 1));
        calculator.sub(1,1);
        calculator.mul(1,1);
        calculator.div(1,0);
//        System.out.println(calculator.getClass());
//        System.out.println("------------------");
//        MyInterface proxy = (MyInterface) CalculatorProxy.getProxy(new MySubClass());
//        proxy.show(100);
    }
    @Test
    public void test02() throws NoSuchMethodException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/study/Spring/AOP/day1/applicationContext.xml");
        Calculator calculator = context.getBean( Calculator.class);
        calculator.add(1,1);
    }
}
