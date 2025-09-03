package com.udemy.repository.impl;

import com.udemy.common.HibernateUtil;
import com.udemy.entity.Movie;
import com.udemy.repository.MovieRepository;
import java.util.List;
import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MovieRepositoryImpl implements MovieRepository {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Movie save(Movie movie) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(movie);
            transaction.commit();
            return movie;
        }
    }

    @Override
    public Optional<Movie> findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return Optional.of(session.get(Movie.class, id));
        }
    }

    @Override
    public List<Movie> findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from Movie", Movie.class).list();
        }
    }

    @Override
    public void deleteById(Long id) {
        findById(id).ifPresent(movie -> {
            try (Session session = sessionFactory.openSession()) {
                Transaction transaction = session.beginTransaction();
                session.delete(movie);
                transaction.commit();
            }
        });
    }
}
