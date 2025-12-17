package com.example.demo.entity;

@Entity
public class StudentEntity{
    private String name;
    private Integer id;
    private String email;
    private String password;
    private Date created;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public String getEmail(){
        return email;
    }
    public void setName(String name){
        this.name=name;
    }
}