package com.example.productdemo.entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mt_Agent")
public class AgentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="agent_id")
    private Long agent_id;
    @Column(name ="agent_name")
    private String agent_name;
    @Column(name ="agent_dob")
    private Date agent_dob;
    @Column(name ="agent_type")
    private String agent_type;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_details_fk",referencedColumnName = "contact_details_id")
    private ContactDetailsEntity contactDetailsEntity;

    public AgentEntity(Long agent_id, String agent_name, Date agent_dob, String agent_type, ContactDetailsEntity contactDetailsEntity) {
        this.agent_id = agent_id;
        this.agent_name = agent_name;
        this.agent_dob = agent_dob;
        this.agent_type = agent_type;
        this.contactDetailsEntity = contactDetailsEntity;
    }

    public AgentEntity() {
    }

    public void setAgent_id(Long agent_id) {
        this.agent_id = agent_id;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    public void setAgent_dob(Date agent_dob) {
        this.agent_dob = agent_dob;
    }

    public void setAgent_type(String agent_type) {
        this.agent_type = agent_type;
    }

    public void setContactDetailsEntity(ContactDetailsEntity contactDetailsEntity) {
        this.contactDetailsEntity = contactDetailsEntity;
    }

    public Long getAgent_id() {
        return agent_id;
    }

    public String getAgent_name() {
        return agent_name;
    }

    public Date getAgent_dob() {
        return agent_dob;
    }

    public String getAgent_type() {
        return agent_type;
    }

    public ContactDetailsEntity getContactDetailsEntity() {
        return contactDetailsEntity;
    }
}
