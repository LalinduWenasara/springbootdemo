package com.example.productdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mt_price_status")
public class PriceStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="price_status_id")
    private Long price_status_id;

    @Column(name ="price_status_info")
    private String price_status_name;

    // Mapping the column of this table


    public PriceStatusEntity() {
    }

    public PriceStatusEntity(Long price_status_id, String price_status_name) {
        this.price_status_id = price_status_id;
        this.price_status_name = price_status_name;
    }


    public Long getPrice_status_id() {
        return price_status_id;
    }

    public void setPrice_status_id(Long price_status_id) {
        this.price_status_id = price_status_id;
    }

    public String getPrice_status_name() {
        return price_status_name;
    }

    public void setPrice_status_name(String price_status_name) {
        this.price_status_name = price_status_name;
    }
}

