package com.example.demo.service.impl;

import com.example.demo.entity.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;


public class TimestampServiceimpl{
     @Autowired ValidationRepository ves;

    @Override
    public Timestamp tpostall(Timestamp v){
        return ves.save(v);
    }
}