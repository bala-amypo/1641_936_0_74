package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=6,max=30,message="Must be 6 to 30")
    private String username;
    @Email(message="Email is not valid")
    private String email;
    @Size(min=0,max=6,message="Password must contain 6 letters")
    @NotNull(message="Password is mandatory")
    private String password;
    @Max(30)
    @Positive
    @NotNull
    private int age;

    //Id -primary key
    public Long getID(){
        return id;
    }
    public void setID(Long id){
        this.id=id;
    }

    //Name
    public String getName(){
        return username;
    }
    public void setName(String username){
        this.username=username;
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

    // Age
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public ValidationEntity(
        Long id,
        @NotNull @Size(min=6,max=30,message="Must be 6 to 30") String username,
        @Email(message="Email is not valid") String email,
        @Size(min=0,max=6,message="Password must contain 6 letters") @NotNull(message="Password is mandatory") String password,
        @Max(30) @Positive @NotNull int age
    ){
        this.id=id;
        this.username=username;
        this.email=email;
        this.password=password;
        this.age=age;
    }
    public ValidationEntity(){

    }
}