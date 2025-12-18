package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
import java.util.List;

public interface StudentService{
        StudentEntity postdata(StudentEntity stu);
        List<StudentEntity> getdata();
        String deletedata(int id);
        StudentEntity  updatedata(int id);
}