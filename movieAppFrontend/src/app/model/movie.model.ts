export class Movie {
    id: number;
    title: string;
    year: string;
    rated: string;
    released: string;
    runtime: string;
    genre: string;
    director: string;
    writer: string;
    actor: string;
    plot: string;
    country: string;
    poster: string;
    imdbRating: number;

    constructor() {
        this.id = 0;
        this.title = "";
        this.year = "";
        this.rated = "";
        this.released = "";
        this.runtime = "";
        this.genre = "";
        this.director = "";
        this.writer = "";
        this.actor = "";
        this.plot = "";
        this.country = "";
        this.poster = "";
        this.imdbRating = 0;
    }
}