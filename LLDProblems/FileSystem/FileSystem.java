package com.cloudvendor.cloudvendor.LLDProblems.FileSystem;

import com.cloudvendor.cloudvendor.LLDProblems.FileSystem.PrintAllMovies.Directory;
import com.cloudvendor.cloudvendor.LLDProblems.FileSystem.PrintAllMovies.File;
import com.cloudvendor.cloudvendor.LLDProblems.FileSystem.PrintAllMovies.Movie;

import java.util.ArrayList;

public class FileSystem {
    public static void main(String varchars[]) {
        System.out.println("LLD of File System is working...");
        Directory d1 = new Directory("Movie");
        d1.add(new File("abc.mp4"));

        Directory d2 = new Directory("comedy");
        d2.add(new File("X.mp4"));
        d2.add(new File("Y.mp4"));

        Directory d3 = new Directory("horror");

        d3.add(new File("Q.mp4"));

        Directory d4 = new Directory("emotional");
        d4.add(new File("E.mp4"));
        d4.add(new File("F.mp4"));

        d3.add(new File("Q.mp4"));

        d3.add(d4);
        d2.add(d3);
        d1.add(d2);

        d1.print(new ArrayList<>());
    }
}
