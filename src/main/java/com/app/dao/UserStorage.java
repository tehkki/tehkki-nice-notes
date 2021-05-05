package com.app.dao;

import model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// In-memory storage
@Component
public class UserStorage {
    private List<User> users = new ArrayList<>();
    private User defaultUser = new User("Unknown", "", "");

    public User getUserById(Integer userId) {
        // validation
        for (int i = 0; i < users.size(); i++){
            User user = users.get(i);

            if (user.getUserId().equals(userId))
                return user;
        }

        return null;
    }

    public User getCurrentUser() {
        return defaultUser;
    }

    public void addUser(User newUser){
        users.add(newUser);
    }
}
