package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //fake user List
    List<User> userList = List.of(
            new User(1311L, "Durgesh T", "9856986799"),
            new User(1312L, "Ankit G", "8167987618"),
            new User(1314L, "Riya ", "819745997714"));

    @Override
    public User getUser(Long id) {
        return userList.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
