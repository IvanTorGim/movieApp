import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Movie } from 'src/app/model/movie.model';
import { API_BASE_URL, MY_LIST_ENDPOINT } from 'src/app/utils/apiRoutes';

@Injectable({
  providedIn: 'root'
})
export class MyListService {

  constructor(private http: HttpClient) { }

  getMyListMovies(): Observable<Movie[]> {
    return this.http.get<Movie[]>(`${API_BASE_URL}${MY_LIST_ENDPOINT}`)
  }
}
