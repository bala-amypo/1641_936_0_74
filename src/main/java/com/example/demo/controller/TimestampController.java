package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.TimestampService;
@RestController
public class TimestampController{
    @Autowired TimestampService s;
    @PostMapping("/vpost")
    public ValidationEntity tpostdata(@Valid @RequestBody Timestamp v){
        return s.tpostall(v);
    }
}