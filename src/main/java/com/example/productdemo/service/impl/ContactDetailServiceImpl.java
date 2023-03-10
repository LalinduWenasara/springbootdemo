package com.example.productdemo.service.impl;

import com.example.productdemo.entity.ContactDetailsEntity;
import com.example.productdemo.repository.ContactDetailsRepository;
import com.example.productdemo.service.ContactDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactDetailServiceImpl implements ContactDetailsService {

    private final ContactDetailsRepository contactDetailsRepository;

    public ContactDetailServiceImpl(ContactDetailsRepository contactDetailsRepository) {
        this.contactDetailsRepository = contactDetailsRepository;
    }


    @Override
    public List<ContactDetailsEntity> findAllContacts() {
        return contactDetailsRepository.findAll();
    }

    @Override
    public Optional<ContactDetailsEntity> findById(Long contact_details_id) {
        return contactDetailsRepository.findById(contact_details_id);
    }

    @Override
    public ContactDetailsEntity saveContact(ContactDetailsEntity contactDetailsEntity) {
        return contactDetailsRepository.save(contactDetailsEntity);
    }

    @Override
    public ContactDetailsEntity updateContact(ContactDetailsEntity contactDetailsEntity) {
        return contactDetailsRepository.save(contactDetailsEntity);
    }

    @Override
    public void deleteContactDetails(Long contact_details_id) {

    }
}
