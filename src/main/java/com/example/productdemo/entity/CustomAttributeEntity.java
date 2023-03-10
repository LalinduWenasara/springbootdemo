package com.example.productdemo.entity;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "mt_custom_attribute")
public class CustomAttributeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;
    @Column(name ="attribute_name")
    private String attribute_name;


}

