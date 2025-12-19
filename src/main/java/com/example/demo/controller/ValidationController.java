package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import jakarta.validation.Valid;

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

    @GetMapping("/vget/{id}")
    public ValidationEntity vgetall(@PathVariable long id){
            return s.vgetid(id);
    }
}