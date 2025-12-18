package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.vali

import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
import java.util.List;

@RestController
public class ValidationController{
    @Autowired ValidationService s;
    @PostMapping("/vpost")
    public ValidationEntity vpostdata(@Valid @RequestBody ValidationEntity v){
        return s.vpostall(v);
    }
}