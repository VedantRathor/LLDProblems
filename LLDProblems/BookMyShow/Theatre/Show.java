package com.cloudvendor.cloudvendor.LLDProblems.BookMyShow.Theatre;

import com.cloudvendor.cloudvendor.LLDProblems.BookMyShow.Movie.Movie;

import java.util.List;

public class Show {
    private Integer showId;
    private Movie movie;
    private Integer startTime;
    private Screen screen;

    public Show() {

    }

    public Show(Integer showId, Movie movie, Integer startTime, Screen screen) {
        this.showId = showId;
        this.movie = movie;
        this.startTime = startTime;
        this.screen = screen;
    }

    public Integer getShowId() {
        return showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public Screen getScreen() {
        return screen;
    }

    public List<Seat> getAvailableSeats() {
        return screen.getAvailableSeats();
    }

    public List<Seat> getAllSeats() {
        return screen.getAllSeats();
    }

    public boolean bookMyShow(Integer seatId) {
        return screen.bookMySeat(seatId);
    }
}
