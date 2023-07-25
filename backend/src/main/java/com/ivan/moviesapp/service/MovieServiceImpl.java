package com.ivan.moviesapp.service;

import com.ivan.moviesapp.entity.MovieEntity;
import com.ivan.moviesapp.model.MovieModel;
import com.ivan.moviesapp.repository.MovieRepository;
import com.ivan.moviesapp.utilities.mappers.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "movieServiceImpl")
public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieRepository movieRepository;

    public MovieModel getMovie(int id) {
        MovieEntity movieEntity = this.movieRepository.findById(id).get();
        MovieModel movieModel = MovieMapper.toModel(movieEntity);
        return movieModel;

    }

    public MovieModel insertMovie(MovieModel movieModel) {
        String title = movieModel.getTitle();
        MovieEntity existsMovie = this.movieRepository.findByTitle(title);
        MovieEntity movieEntity = MovieMapper.toEntity(movieModel);
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
            movieModel = MovieMapper.toModel(movieEntity);
            this.movieRepository.delete(movieEntity);
            return movieModel;
        }
        return null;
    }

    public List<MovieModel> getAllMovies() {
        List<MovieEntity> movieEntities = this.movieRepository.findAll();
        List<MovieModel> movieModels = movieEntities.stream()
                .map(movie -> MovieMapper.toModel(movie))
                .toList();
        return movieModels;
    }

    public List<MovieModel> getMyListMovies() {
        List<MovieEntity> movieEntities = this.movieRepository.findMyListMovies();
        List<MovieModel> movieModels = movieEntities.stream()
                .map(movie -> MovieMapper.toModel(movie))
                .toList();
        return movieModels;
    }

}
