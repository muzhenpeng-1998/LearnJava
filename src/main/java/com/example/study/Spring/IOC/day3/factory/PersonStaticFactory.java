package com.example.study.Spring.IOC.day3.factory;

import com.example.study.Spring.IOC.day3.bean.Person;

/**
 * 静态工厂类
 */
public class PersonStaticFactory {

    public static Person getInstance(String name){
        Person person = new Person();
        person.setId(1);
        person.setName(name);
        person.setAge(11);
        return person;
    }
}
