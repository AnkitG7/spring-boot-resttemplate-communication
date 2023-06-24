package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //fake list of contacts
    List<Contact> contactList= List.of(
      new Contact(1L,"durgest@gmail.com","Durgest",1311L),
      new Contact(2L,"anil@gmail.com","Anil",1311L),
      new Contact(3L,"ankit@gmail.com","Ankit",1312L),
      new Contact(4L,"riya@gmail.com","Riya",1314L)
    );

    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return contactList.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
