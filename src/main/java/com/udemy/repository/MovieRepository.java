package com.udemy.repository;

import com.udemy.entity.Movie;
import java.util.List;
import java.util.Optional;

public interface MovieRepository {
    Movie save(Movie movie);
    Optional<Movie> findById(Long id);
    List<Movie> findAll();
    void deleteById(Long id);
}
