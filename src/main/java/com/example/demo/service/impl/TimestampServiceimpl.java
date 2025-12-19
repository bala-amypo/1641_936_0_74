package com.example.demo.service.impl;

import com.example.demo.entity.Timestamp;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.TimestampRepository;
import com.example.demo.service.TimestampService;

@Service
public class TimestampServiceimpl implements TimestampService{
     @Autowired TimestampRepository ves;

    @Override
    public Timestamp tpostall(Timestamp v){
        return ves.save(v);
    }
}