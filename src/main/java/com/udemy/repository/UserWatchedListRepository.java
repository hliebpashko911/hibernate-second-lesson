package com.udemy.repository;

import com.udemy.entity.UserWatchedList;
import java.util.List;
import java.util.Optional;

public interface UserWatchedListRepository {
    UserWatchedList save(UserWatchedList userWatchedList);
    Optional<UserWatchedList> findById(Long id);
    List<UserWatchedList> findAllByUserId(Long userId);
    void deleteById(Long id);
}
