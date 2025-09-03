package com.udemy.repository;

import com.udemy.entity.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository {
    void save(User user);
    Optional<User> getById(Long id);
    List<User> getAll();
    void update(User user);
    void delete(Long id);
}
