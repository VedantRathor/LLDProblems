package com.cloudvendor.cloudvendor.LLDProblems.BookMyShow.Movie;

public class Movie {
    private Integer movieId;
    private String movieName;
    private Integer duration;

    public Movie(Integer movieId, String movieName, Integer duration) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.duration = duration;
    }
}
