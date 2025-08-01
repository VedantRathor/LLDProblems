package com.cloudvendor.cloudvendor.LLDProblems.BookMyShow.Theatre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TheatreController {
    private Map<String, List<Theatre>> cityWiseTheatreMap;

    public TheatreController() {
        cityWiseTheatreMap = new HashMap<>();
    }

    public void addTheatre(String cityName, Theatre theatre) {
        if (!cityWiseTheatreMap.containsKey(cityName)) {
            cityWiseTheatreMap.put(cityName, new ArrayList<>());
        }

        cityWiseTheatreMap.get(cityName).add(theatre);
    }

    public void removeTheatre(String cityName, Theatre theatre) {
        List<Theatre> theatres = cityWiseTheatreMap.get(cityName);
        if (theatres != null && !theatres.isEmpty()) {
            theatres.remove(theatre);
        }
//        cityWiseTheatreMap.put(cityName, theatres);
    }

    public List<Theatre> getAllTheatresByCity(String cityName) {
        return cityWiseTheatreMap.get(cityName);
    }

    public Map<String, List<Show>> getAllShowsTheatreWise(String cityName, String movieName) {
        Map<String, List<Show>> theatreWiseShows = new HashMap<>();

        List<Theatre> theatres = cityWiseTheatreMap.get(cityName);

        for (Theatre theatre: theatres) {
            List<Show> allShows = theatre.getShows();
            List<Show> filteredShows = allShows.stream().filter((show) -> show.getMovie().getMovieName().equals(movieName)).toList();
            theatreWiseShows.put(cityName, filteredShows);
        }

        return theatreWiseShows;
    }
}
