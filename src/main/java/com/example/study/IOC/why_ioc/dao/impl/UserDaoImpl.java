package com.example.study.IOC.why_ioc.dao.impl;

import com.example.study.IOC.why_ioc.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取用户");
    }
}
