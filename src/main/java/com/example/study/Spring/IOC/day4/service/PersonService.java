package com.example.study.Spring.IOC.day4.service;

import com.mashibing.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public void save(){
        System.out.println("personservice");
        personDao.save();
    }
}
