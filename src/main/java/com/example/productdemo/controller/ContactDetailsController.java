package com.example.productdemo.controller;
import com.example.productdemo.entity.ContactDetailsEntity;
import com.example.productdemo.service.ContactDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contact_details")
public class ContactDetailsController {

    private final ContactDetailsService contactDetailsService;

    public ContactDetailsController(ContactDetailsService contactDetailsService) {
        this.contactDetailsService = contactDetailsService;
    }

    @GetMapping
    public List<ContactDetailsEntity> findAllContacts(){
        return contactDetailsService.findAllContacts();
    }

    @GetMapping("/{id}")
    public Optional<ContactDetailsEntity> findById(@PathVariable("id") Long contact_details_id){
        System.out.println("product controller hit");
        return contactDetailsService.findById(contact_details_id);
    }

    @PostMapping
    public ContactDetailsEntity saveContact(@RequestBody ContactDetailsEntity contactDetailsEntity){
        return contactDetailsService.saveContact(contactDetailsEntity);
    }
    @PutMapping
    public ContactDetailsEntity updateContact(@RequestBody ContactDetailsEntity contactDetailsEntity) {
        return contactDetailsService.updateContact(contactDetailsEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteContactDetails(@PathVariable("id") Long id) {
        contactDetailsService.deleteContactDetails(id);
    }



}
