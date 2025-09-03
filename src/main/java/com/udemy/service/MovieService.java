package com.udemy.service;

import com.udemy.entity.Movie;
import java.util.List;

public interface MovieService {
    Movie save(Movie movie);
    Movie findById(Long id);
    List<Movie> findAll();
    void deleteById(Long id);
}
