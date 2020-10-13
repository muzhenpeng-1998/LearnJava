package com.example.study.Spring.IOC.day4.service;

import com.example.study.Spring.IOC.day4.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService2 extends PersonService{

    @Autowired
    private PersonDao personDao;

    @Override
    public void save(){
        System.out.println("personservice2...........");
        personDao.save();
    }

}
