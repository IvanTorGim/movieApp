package com.ivan.moviesapp.component;

import com.ivan.moviesapp.model.MovieModel;
import com.ivan.moviesapp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("movies")
public class MovieController {
    @Autowired
    @Qualifier("movieServiceImpl")
    private MovieService movieService;

    @GetMapping("/{id}")
    public MovieModel getMovie(@PathVariable(value = "id") int id) {
        return this.movieService.getMovie(id);
    }

    @PostMapping("/insert")
    public MovieModel insertMovie(@RequestBody MovieModel movieModel) {
        return this.movieService.insertMovie(movieModel);
    }

    @DeleteMapping("delete/{id}")
    public MovieModel deleteMovie(@PathVariable("id") int id) {
        return this.movieService.deleteMovie(id);
    }
}
