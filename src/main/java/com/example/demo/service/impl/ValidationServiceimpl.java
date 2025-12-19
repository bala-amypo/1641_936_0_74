package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.exception.ValidationException;

import java.util.List;


@Service
public class ValidationServiceimpl implements ValidationService{
    
    @Autowired ValidationRepository ves;

    @Override
    public ValidationEntity vpostall(ValidationEntity v){
        return ves.save(v);
    }

    @Override
    public ValidationEntity vgetid(long id){
        return ves.findById(id).orElseThrow(()->new ValidationException("Invalid Id :"+id));
    }

}