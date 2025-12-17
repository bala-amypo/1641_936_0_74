package com.example.demo.entity;

@Entity
public class StudentEntity{
    private Integer id;
    private String name;
    private String email;
    private String password;

    //Name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    //Id -primary key
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }

    //Email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    // Password
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }

    //Parameter constructor

    public StudentEntity(Integer id,String ,String email,String password){
        this.name=name;
        this.id=id;
        this.email=email;
        this.password=password;
    }
}