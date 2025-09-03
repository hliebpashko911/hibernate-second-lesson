package com.udemy;

import com.udemy.entity.Movie;
import com.udemy.entity.User;
import com.udemy.entity.UserWatchedList;
import com.udemy.service.MovieService;
import com.udemy.service.UserService;
import com.udemy.service.UserWatchedListService;
import com.udemy.service.impl.MovieServiceImpl;
import com.udemy.service.impl.UserServiceImpl;
import com.udemy.service.impl.UserWatchedListServiceImpl;

public class Main {
    public static void main(String[] args) {
        // USER
        UserService userService = new UserServiceImpl();
        User user = new User();
        user.setFirstName("Leo");
        user.setLastName("Messi");
        userService.save(user);

//        System.out.println(userService.findById(user.getId()));
//        System.out.println(userService.findAll());
//
//        user.setFirstName("Lionel");
//        user.setLastName("Messi");
//        userService.update(user);
//        System.out.println(userService.findById(user.getId()));
//
//        // MOVIE
//        MovieService movieService = new MovieServiceImpl();
//
//        Movie movie = new Movie();
//        movie.setTitle("F1");
//        movieService.save(movie);
//
//        System.out.println(movieService.findById(movie.getId()));
//
//        // USERWATCHEDLIST
//        UserWatchedListService userWatchedListService = new UserWatchedListServiceImpl();
//
//        UserWatchedList userWatchedList = new UserWatchedList();
//        userWatchedList.setUser(user);
//        userWatchedList.setMovie(movie);
//        userWatchedList.setPercentOfWatched(100);
//
//        userWatchedListService.save(userWatchedList);
//
//        System.out.println(userWatchedListService.findById(userWatchedList.getId()));
//
//        userService.deleteById(user.getId());
    }
}