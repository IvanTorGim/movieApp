package com.ivan.moviesapp.repository;

import com.ivan.moviesapp.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
    MovieEntity findByTitle(String title);

    //TODO create query to find my list movies using inner join to mylist table
    @Query(nativeQuery = true, value = "SELECT * FROM movie")
    List<MovieEntity> findMyListMovies();
}
