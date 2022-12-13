package com.contact.service;

import com.contact.Entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService{

    //fake list of contacts

    List<Contact> list = List.of(
            new Contact(1L,"ajay@gmail.com","ajay",1311L),
            new Contact(2L,"shivanshu@gmail.com","shivanshu",1312L),
            new Contact(3L,"sneha@gmail.com","sneha",1311L),
            new Contact(4L,"sharad@gmail.com","sharad",1314L)

    );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
