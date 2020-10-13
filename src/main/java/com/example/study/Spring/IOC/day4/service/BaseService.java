package com.example.study.Spring.IOC.day4.service;

import com.example.study.Spring.IOC.day4.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class BaseService<T> {

    @Autowired
    private BaseDao<T> baseDao;

    public void save(){
        baseDao.save();
    }
}
