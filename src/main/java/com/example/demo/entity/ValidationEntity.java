package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ValidationEntity{
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    private int age;
}