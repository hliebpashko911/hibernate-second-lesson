package com.udemy.repository.impl;


import com.udemy.common.HibernateUtil;
import com.udemy.entity.UserWatchedList;
import com.udemy.repository.UserWatchedListRepository;
import java.util.List;
import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserWatchedListRepositoryImpl implements UserWatchedListRepository {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public UserWatchedList save(UserWatchedList userWatchedList) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(userWatchedList);
            transaction.commit();
            return userWatchedList;
        }
    }

    @Override
    public Optional<UserWatchedList> findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return Optional.of(session.get(UserWatchedList.class, id));
        }
    }

    @Override
    public List<UserWatchedList> findAllByUserId(Long userId) {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from UserWatchedList where user.id = :userId", UserWatchedList.class)
                    .setParameter("userId", userId)
                    .list();
        }
    }

    @Override
    public void deleteById(Long id) {
        findById(id).ifPresent(watchedList -> {
            try (Session session = sessionFactory.openSession()) {
                Transaction transaction = session.beginTransaction();
                session.delete(watchedList);
                transaction.commit();
            }
        });
    }
}
