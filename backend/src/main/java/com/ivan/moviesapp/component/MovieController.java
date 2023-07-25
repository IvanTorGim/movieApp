package com.ivan.moviesapp.component;

import com.ivan.moviesapp.model.MovieModel;
import com.ivan.moviesapp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("movies")
@CrossOrigin(origins = "http://localhost:4200")
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

    @GetMapping("/list")
    public List<MovieModel> getAllMovies() {
        return this.movieService.getAllMovies();
    }

}
