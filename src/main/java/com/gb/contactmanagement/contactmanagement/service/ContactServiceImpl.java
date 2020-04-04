package com.gb.contactmanagement.contactmanagement.service;

import com.gb.contactmanagement.contactmanagement.model.Contact;
import com.gb.contactmanagement.contactmanagement.repository.ContactRepository;
import com.gb.contactmanagement.contactmanagement.web.dto.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    ContactRepository contactRepository;

    @Override
    public Contact save(ContactDto contactDto) {
        return contactRepository.save(new Contact(contactDto));
    }

    @Override
    public Optional<Contact> findById(String emailId) {
        return contactRepository.findById(emailId);
    }

    @Override
    public List<Contact> findByName(String name) {
        return null;
    }

    @Override
    public List<Contact> findByGender(String gender) {
        return null;
    }
}
