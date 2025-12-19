package com.example.demo.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Timestamp{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    @PrePersist
    LocalDateTime now= LocalDateTime().now();
    public void Oncreate(){
        this.createdAt=now;
        this.updatedAt=now;
    }

    @PreUpdate
    LocalDateTime n= LocalDateTime().now();
    public void Afterupdate(){
        this.updatedAt=n;
    }
}