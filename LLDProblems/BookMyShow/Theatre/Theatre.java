package com.cloudvendor.cloudvendor.LLDProblems.BookMyShow.Theatre;

import java.util.List;
import java.util.stream.Collectors;

public class Theatre {
    private Integer theatreId;
    private String address;
    private List<Screen> screens;
    private List<Show> shows;

    public Theatre(Integer theatreId, String address) {
        this.theatreId = theatreId;
        this.address = address;
    }

    public Theatre(Integer theatreId, String address, List<Screen> screens, List<Show> shows) {
        this.theatreId = theatreId;
        this.address = address;
        this.screens = screens;
        this.shows = shows;
    }

    public Integer getTheatreId() {
        return theatreId;
    }

    public String getAddress() {
        return address;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void addScreen(Screen screen) {
        screens.add(screen);
    }
    public void removeScreen(Integer screenId) {
        this.screens = screens.stream().filter((screen) -> screen.getScreenId() != screenId).collect(Collectors.toList());
    }

    public void addShow(Show show) {
        shows.add(show);
    }

    public void removeShow(Integer showId) {
        this.shows = shows.stream().filter((show) -> show.getShowId() != showId).collect(Collectors.toList());
    }
}
