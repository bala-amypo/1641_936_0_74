package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.entity.ValidationEntity;
import java.util.List;


@Service
public class ValidationServiceimpl implements ValidationService{
        
    // @Autowired StudentRepository student;
    // // save,findAll(),findById(),deleteId(),existsById()
    // @Override
    // public StudentEntity postdata(StudentEntity stu){
    //     return student.save(stu);
    // }


    // @Override
    // public List<StudentEntity> getdata(){
    //     return student.findAll();
    // }

    // @Override
    // public String deletedata(int id){
    //     student.deleteById(id);
    //     return "Deleted Successfully";
    // }

    // @Override
    // public StudentEntity getid(int id){
    //     return student.findById(id).orElse(null);
    // }

    // @Override 
    // public StudentEntity updatedata(int id,StudentEntity s){
    //     if(student.existsById(id)){
    //         s.setID(id);
    //         return student.save(s);
    //     }
    //     return null;
    // }

    @Autowired ValidationRepository ves;

    @Override
    public ValidationEntity vpostall(ValidationEntity v){
        return ves.save(v);
    }
}