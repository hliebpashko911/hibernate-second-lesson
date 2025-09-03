package com.udemy.service.impl;


import com.udemy.entity.UserWatchedList;
import com.udemy.repository.UserWatchedListRepository;
import com.udemy.repository.impl.UserWatchedListRepositoryImpl;
import com.udemy.service.UserWatchedListService;
import java.util.List;

public class UserWatchedListServiceImpl implements UserWatchedListService {

    private final UserWatchedListRepository userWatchedListRepository = new UserWatchedListRepositoryImpl();

    @Override
    public UserWatchedList save(UserWatchedList userWatchedList) {
        if (userWatchedList.getPercentOfWatched() < 80) {
            throw new IllegalArgumentException("Percent of watched must be more than 80");
        }
        return userWatchedListRepository.save(userWatchedList);
    }

    @Override
    public UserWatchedList findById(Long id) {
        return userWatchedListRepository.findById(id).orElse(null);
    }

    @Override
    public List<UserWatchedList> findAllByUserId(Long userId) {
        return userWatchedListRepository.findAllByUserId(userId);
    }

    @Override
    public void deleteById(Long id) {
        userWatchedListRepository.deleteById(id);
    }
}