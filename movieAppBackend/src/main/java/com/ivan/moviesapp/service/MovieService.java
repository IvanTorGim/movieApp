package com.ivan.moviesapp.service;

import com.ivan.moviesapp.model.MovieModel;

public interface MovieService {
    MovieModel getMovie(int id);

    MovieModel insertMovie(MovieModel movieModel);

    MovieModel deleteMovie(int id);
}
