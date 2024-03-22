package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class UserRepository {

    private List<User> userList = new ArrayList<>();

    public void save(User user) {
        userList.add(user);
    }

    public List<User> getAll() {
        return userList;
    }

    public Optional<User> findByEmail(String email) {
        return userList.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }

    public void delete(User user) {
        userList.remove(user);
    }
}
