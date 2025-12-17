package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import com.


@Service
public class StudentServiceimpl implements StudentService{
        
    @Autowired StudentRepository student;
    public StudentEntity postdata(StudentEntity stu){
       
    }

}