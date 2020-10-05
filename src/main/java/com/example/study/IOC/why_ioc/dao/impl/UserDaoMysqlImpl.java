package com.example.study.IOC.why_ioc.dao.impl;

import com.example.study.IOC.why_ioc.dao.UserDao;

public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("从mysql获取数据");
    }
}
