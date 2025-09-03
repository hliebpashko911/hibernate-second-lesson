package com.udemy.service;

import com.udemy.entity.User;
import java.util.List;

public interface UserService {
    User save(User user);
    User findById(Long id);
    List<User> findAll();
    User update(User user);
    void deleteById(Long id);
}
