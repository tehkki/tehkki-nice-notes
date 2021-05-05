package com.app.services;

import com.app.dao.UserStorage;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserStorage userstorage;

    public User getCurrentUser() {
        return userstorage.getCurrentUser();
    }

    public User getUser(Integer userId) {
        return userstorage.getUserById(userId);
    }

    public void addUser(User newUser){
        if (newUser != null)
            userstorage.addUser(newUser);
    }
}
