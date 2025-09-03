package com.udemy.service.impl;


import com.udemy.entity.User;
import com.udemy.repository.UserRepository;
import com.udemy.repository.impl.UserRepositoryImpl;
import com.udemy.service.UserService;
import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public User save(User user) {
        if (user.getLastName() == null || user.getLastName().isEmpty()) {
            throw new IllegalArgumentException("Last name must be not null");
        }
        userRepository.save(user);
        return user;
    }

    @Override
    public User findById(Long id) {
        return userRepository.getById(id).orElseThrow(() -> new IllegalArgumentException("User not found"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.getAll();
    }

    @Override
    public User update(User user) {
        userRepository.update(user);
        return user;
    }

    @Override
    public void deleteById(Long id) {
        userRepository.delete(id);
    }
}
