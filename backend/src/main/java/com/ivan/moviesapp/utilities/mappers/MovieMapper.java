package com.ivan.moviesapp.utilities.mappers;

import com.ivan.moviesapp.entity.MovieEntity;
import com.ivan.moviesapp.model.MovieModel;


public class MovieMapper {
    public static MovieModel toModel(MovieEntity movieEntity) {
        MovieModel movieModel = new MovieModel();
        movieModel.setTitle(movieEntity.getTitle());
        movieModel.setYear(movieEntity.getYear());
        movieModel.setRated(movieEntity.getRated());
        movieModel.setReleased(movieEntity.getReleased());
        movieModel.setRuntime(movieEntity.getRuntime());
        movieModel.setGenre(movieEntity.getGenre());
        movieModel.setDirector(movieEntity.getDirector());
        movieModel.setWriter(movieEntity.getWriter());
        movieModel.setActors(movieEntity.getActors());
        movieModel.setPlot(movieEntity.getPlot());
        movieModel.setCountry(movieEntity.getCountry());
        movieModel.setPoster(movieEntity.getPoster());
        movieModel.setImdbRating(movieEntity.getImdbRating());
        return movieModel;
    }
    public static MovieEntity toEntity(MovieModel movieModel) {
        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setTitle(movieModel.getTitle());
        movieEntity.setYear(movieModel.getYear());
        movieEntity.setRated(movieModel.getRated());
        movieEntity.setReleased(movieModel.getReleased());
        movieEntity.setRuntime(movieModel.getRuntime());
        movieEntity.setGenre(movieModel.getGenre());
        movieEntity.setDirector(movieModel.getDirector());
        movieEntity.setWriter(movieModel.getWriter());
        movieEntity.setActors(movieModel.getActors());
        movieEntity.setPlot(movieModel.getPlot());
        movieEntity.setCountry(movieModel.getCountry());
        movieEntity.setPoster(movieModel.getPoster());
        movieEntity.setImdbRating(movieModel.getImdbRating());
        return movieEntity;
    }

}
