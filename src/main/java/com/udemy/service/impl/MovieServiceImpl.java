package com.udemy.service.impl;


import com.udemy.entity.Movie;
import com.udemy.repository.MovieRepository;
import com.udemy.repository.impl.MovieRepositoryImpl;
import com.udemy.service.MovieService;
import java.util.List;

public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository = new MovieRepositoryImpl();

    @Override
    public Movie save(Movie movie) {
        if (movie.getTitle() == null || movie.getTitle().isEmpty()) {
            throw new IllegalArgumentException("Movie title cannot be null or empty");
        }
        return movieRepository.save(movie);
    }

    @Override
    public Movie findById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        movieRepository.deleteById(id);
    }
}
