package com.cloudvendor.cloudvendor.LLDProblems.FileSystem.PrintAllMovies;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Movie {
    private final String directoryName;
    private List<Movie> movies;
    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.movies = new ArrayList<>();
    }

    public void add(Movie movie) {
        movies.add(movie);
    }
    @Override
    public void print(List<String> curr) {
        curr.add(this.directoryName);

        for (Movie movie: movies) {
            movie.print(curr);
        }

        curr.remove(this.directoryName);
    }
}
