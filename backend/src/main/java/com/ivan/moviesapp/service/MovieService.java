package com.ivan.moviesapp.service;

import com.ivan.moviesapp.model.MovieModel;

import java.util.List;

public interface MovieService {
    MovieModel getMovie(int id);

    MovieModel insertMovie(MovieModel movieModel);

    MovieModel deleteMovie(int id);

    List<MovieModel> getAllMovies();

    List<MovieModel> getMyListMovies();

}
