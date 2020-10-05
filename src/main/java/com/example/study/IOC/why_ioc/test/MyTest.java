package com.example.study.IOC.why_ioc.test;

import com.example.study.IOC.why_ioc.dao.impl.UserDaoMysqlImpl;
import com.example.study.IOC.why_ioc.dao.impl.UserDaoOracleImpl;
import com.example.study.IOC.why_ioc.service.impl.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserDaoMysqlImpl userDaoMysql = new UserDaoMysqlImpl();
        userService.setUserDao(userDaoMysql);
        userService.getUser();
        System.out.println("--------------");
        UserDaoOracleImpl userDaoOracle = new UserDaoOracleImpl();
        userService.setUserDao(userDaoOracle);
        userService.getUser();
    }
}
