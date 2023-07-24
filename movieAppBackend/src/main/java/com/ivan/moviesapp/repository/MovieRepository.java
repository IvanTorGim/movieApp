package com.ivan.moviesapp.repository;

import com.ivan.moviesapp.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
    MovieEntity findByTitle(String title);
}