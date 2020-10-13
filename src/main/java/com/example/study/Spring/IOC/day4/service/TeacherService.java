package com.example.study.Spring.IOC.day4.service;

import com.example.study.Spring.IOC.day4.bean.Student;
import com.example.study.Spring.IOC.day4.bean.Teacher;
import com.example.study.Spring.IOC.day4.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService extends BaseService<Teacher> {

}
