package com.ivan.moviesapp.service;

import com.ivan.moviesapp.entity.MovieEntity;
import com.ivan.moviesapp.model.MovieModel;
import com.ivan.moviesapp.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "movieServiceImpl")
public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieRepository movieRepository;

    public MovieModel getMovie(int id) {
        MovieEntity movieEntity = this.movieRepository.findById(id).get();
        MovieModel movieModel = movieModelConverter(movieEntity);
        return movieModel;

    }

    public MovieModel insertMovie(MovieModel movieModel) {
        String title = movieModel.getTitle();
        MovieEntity existsMovie = this.movieRepository.findByTitle(title);
        MovieEntity movieEntity = movieEntityConverter(movieModel);
        if(existsMovie == null) {
            this.movieRepository.save(movieEntity);
            return movieModel;
        }
        return null;
    }

    public MovieModel deleteMovie(int id) {
        MovieEntity movieEntity = this.movieRepository.findById(id).get();
        MovieModel movieModel;
        if (movieEntity != null) {
            movieModel = movieModelConverter(movieEntity);
            this.movieRepository.delete(movieEntity);
            return movieModel;
        }
        return null;
    }

    private MovieModel movieModelConverter(MovieEntity movieEntity) {
        MovieModel movieModel = new MovieModel();
        movieModel.setTitle(movieEntity.getTitle());
        movieModel.setReleaseYear(movieEntity.getReleaseYear());
        movieModel.setSynopsis(movieEntity.getSynopsis());
        movieModel.setDuration(movieEntity.getDuration());
        return movieModel;
    }

    private MovieEntity movieEntityConverter(MovieModel movieModel) {
        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setTitle(movieModel.getTitle());
        movieEntity.setReleaseYear(movieModel.getReleaseYear());
        movieEntity.setSynopsis(movieModel.getSynopsis());
        movieEntity.setDuration(movieModel.getDuration());
        return movieEntity;
    }
}
