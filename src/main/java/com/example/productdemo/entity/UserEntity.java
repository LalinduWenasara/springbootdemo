package com.example.productdemo.entity;
import jakarta.persistence.*;
import java.util.Date;


@Entity
@Table(name = "mt_user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="user_id")
    private Long user_id;
    @Column(name ="user_name")
    private String user_name;
    @Column(name ="user_address")
    private String user_address;
    @Column(name ="user_dob")
    private Date user_dob;

    public UserEntity() {
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public Date getUser_dob() {
        return user_dob;
    }

    public void setUser_dob(Date user_dob) {
        this.user_dob = user_dob;
    }

    public UserEntity(Long user_id, String user_name, String user_address, Date user_dob) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_address = user_address;
        this.user_dob = user_dob;
    }

}
