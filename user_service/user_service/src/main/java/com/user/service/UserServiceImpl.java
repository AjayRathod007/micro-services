package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    //Fake user List
    List<User> list = List.of(
            new User(1311L,"Ajay","7828050630"),
            new User(1312L,"Shivanshu","9828050630"),
            new User(1314L,"Sneha","8828050630")
            );


    @Override
    public User getUser(long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
