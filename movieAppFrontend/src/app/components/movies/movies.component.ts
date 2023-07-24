import { Component, OnInit } from '@angular/core';
import { Movie } from 'src/app/model/movie.model';
import { MoviesService } from './movies.service';


@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  
  movies: Movie[] = [];
  
  constructor(private movieService: MoviesService) {}
  
  ngOnInit(): void {
    this.getMovies();
  }

  getMovies() {
    this.movieService.getMovies()
    .subscribe((movies: Movie[]) => {
      this.movies = movies;
    });
  }
}
