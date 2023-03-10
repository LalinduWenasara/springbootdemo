package com.example.productdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mt_contact_details")
public class ContactDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="contact_details_id")
    private Long contact_id;
    @Column(name ="address")
    private String address;
//    @OneToOne(mappedBy = "contactDetailsEntity")
//    private AgentEntity agentEntity;

    public ContactDetailsEntity(Long contact_id, String address) {
        this.contact_id = contact_id;
        this.address = address;
    }

    public ContactDetailsEntity() {
    }

    public Long getContact_id() {
        return contact_id;
    }

    public void setContact_id(Long contact_id) {
        this.contact_id = contact_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
