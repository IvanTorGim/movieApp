import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Movie } from 'src/app/model/movie.model';
import { Observable } from 'rxjs';
import { API_BASE_URL, MOVIE_ENDPOINT } from 'src/app/utils/apiRoutes';

@Injectable({
    providedIn: 'root'
})
export class MoviesService {


    constructor(private http: HttpClient) {}

    getMovies(): Observable<Movie[]> {
        return this.http.get<Movie[]>(`${API_BASE_URL}${MOVIE_ENDPOINT}/list`);
    }

}