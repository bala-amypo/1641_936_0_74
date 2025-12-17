package com.example.demo.entity;

@Entity
public class StudentEntity{
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Date created;
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

    // Created
    public Date getCreated(){
        return 
    }

    //Parameter constructor

    public StudentEntity(Integer id,String name,String email,String password){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
    }

    // Default constructor
    public StudentEntity(){

    }
}