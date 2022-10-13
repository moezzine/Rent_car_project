package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.ContactRepository;
import com.fleetapp.fleetapp.models.Contact;
import com.fleetapp.fleetapp.models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;
    public List<Contact>  getContact() {
        return contactRepository.findAll();
    }

    public void save(Contact contact) {
        contactRepository.save(contact);
    }

    public Optional<Contact> findbyid(int id) {
       return contactRepository.findById(id);
    }

    public void update(Contact contact) {
        contactRepository.save(contact);
    }
    public void delete(int id) {
        contactRepository.deleteById(id);

    }
}
