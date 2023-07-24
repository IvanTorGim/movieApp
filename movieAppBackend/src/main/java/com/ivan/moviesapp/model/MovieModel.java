package com.ivan.moviesapp.model;

import java.util.Date;

public class MovieModel {

    private String title;
    private Date releaseYear;
    private String synopsis;
    private int duration;

    public MovieModel() {
    }

    public MovieModel(String title, Date releaseYear, String synopsis, int duration) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.synopsis = synopsis;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
