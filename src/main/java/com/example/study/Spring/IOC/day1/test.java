package com.example.study.Spring.IOC.day1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/study/Spring/IOC/day1/ioc.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
}
