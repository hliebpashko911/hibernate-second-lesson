package com.udemy.service;

import com.udemy.entity.UserWatchedList;
import java.util.List;

public interface UserWatchedListService {
    UserWatchedList save(UserWatchedList userWatchedList);
    UserWatchedList findById(Long id);
    List<UserWatchedList> findAllByUserId(Long userId);
    void deleteById(Long id);
}
