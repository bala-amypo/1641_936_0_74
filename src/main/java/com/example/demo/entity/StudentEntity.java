package com.example.demo.entity;

@Entity
public class StudentEntity{
    private String name;
    private Integer id;
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
    public void setName(String password){
        this.password=password;
    }

    //Parameter cons
}