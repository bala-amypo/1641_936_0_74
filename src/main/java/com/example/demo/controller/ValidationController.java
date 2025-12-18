package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
import java.util.List;

@RestController
public class StudentController{
    // @Autowired StudentService ser;
    // @PostMapping("/post")
    // public StudentEntity sendData(@RequestBody StudentEntity stu){
    //         return ser.postdata(stu);
    // }

    // @GetMapping("/get")
    // public List<StudentEntity> getAllData(){
    //     return ser.getdata();
    // }

    // @DeleteMapping("/delete/{id}")
    // public String deleteid(@PathVariable int id){
    //     return ser.deletedata(id);
    // }

    // @GetMapping("/getid/{id}")
    // public StudentEntity getdataid(@PathVariable int id){
    //     return ser.getid(id);
    // }

    // @PutMapping("/update/{id}")
    // public StudentEntity update(@PathVariable int id,@RequestBody StudentEntity stu){
    //     return ser.updatedata(id,stu);
    // }
    @Autowired ValidationService s
    @PostMapping("vpost")
    public ValidationEntity vpostdata(@RequestBody ValidationEntity v){
        return s.vpostall(v)
    }
}