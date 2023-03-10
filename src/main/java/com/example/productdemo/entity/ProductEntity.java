package com.example.productdemo.entity;

import jakarta.persistence.*;


//@Embeddable
@Entity
@Table(name = "mt_product")
public class ProductEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="product_id")
    private Long product_id;




    @Column(name ="product_name")
    private String product_name;
    @Column(name ="product_type")
    private String product_type;
    @Column(name ="product_status")
    private String product_status;

    public ProductEntity(){

    }

    public ProductEntity(Long product_id, String product_name, String product_type, String product_status) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_type = product_type;
        this.product_status = product_status;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getProduct_status() {
        return product_status;
    }

    public void setProduct_status(String product_status) {
        this.product_status = product_status;
    }
}
