package com.example.study.Spring.IOC.day4.dao;

import com.mashibing.bean.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao extends BaseDao<Student> {
    public void save() {
        System.out.println("保存学生");
    }
}
