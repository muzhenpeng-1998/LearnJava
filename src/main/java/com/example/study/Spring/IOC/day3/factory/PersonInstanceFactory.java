package com.example.study.Spring.IOC.day3.factory;

import com.example.study.Spring.IOC.day3.bean.Person;

/**
 * 实例工厂
 */
public class PersonInstanceFactory {

    public Person getInstance(String name){
        Person person = new Person();
        person.setId(2);
        person.setName(name);
        person.setAge(22);
        return person;
    }
}
