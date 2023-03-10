package com.example.productdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mt_price")
public class PriceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="price_id")
    private Long price_id;
    @Column(name ="product_id")
    private String product_id;
    @Column(name ="price_unit")
    private float price_unit;


    @Column(name ="price_base")
    private float price_base;
    @Column(name ="price_dis")
    private float price_dis;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private PriceStatusEntity priceStatusEntity;


    public PriceEntity() {
    }

    public PriceEntity(Long price_id, String product_id, float price_unit, float price_base, float price_dis, PriceStatusEntity priceStatusEntity) {
        this.price_id = price_id;
        this.product_id = product_id;
        this.price_unit = price_unit;
        this.price_base = price_base;
        this.price_dis = price_dis;
        this.priceStatusEntity = priceStatusEntity;
    }


    public Long getPrice_id() {
        return price_id;
    }

    public void setPrice_id(Long price_id) {
        this.price_id = price_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public float getPrice_unit() {
        return price_unit;
    }

    public void setPrice_unit(float price_unit) {
        this.price_unit = price_unit;
    }

    public float getPrice_base() {
        return price_base;
    }

    public void setPrice_base(float price_base) {
        this.price_base = price_base;
    }

    public float getPrice_dis() {
        return price_dis;
    }

    public void setPrice_dis(float price_dis) {
        this.price_dis = price_dis;
    }

    public PriceStatusEntity getPriceStatusEntity() {
        return priceStatusEntity;
    }

    public void setPriceStatusEntity(PriceStatusEntity priceStatusEntity) {
        this.priceStatusEntity = priceStatusEntity;
    }
}
