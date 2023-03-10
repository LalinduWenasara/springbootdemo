package com.example.productdemo.service;
import com.example.productdemo.entity.ContactDetailsEntity;
import java.util.List;
import java.util.Optional;

public interface ContactDetailsService {

    List<ContactDetailsEntity> findAllContacts();
    Optional<ContactDetailsEntity> findById(Long contact_details_id);
    ContactDetailsEntity saveContact(ContactDetailsEntity contactDetailsEntity);
    ContactDetailsEntity updateContact(ContactDetailsEntity contactDetailsEntity);
    void deleteContactDetails(Long contact_details_id);

}
