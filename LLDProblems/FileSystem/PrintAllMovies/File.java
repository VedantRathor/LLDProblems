package com.cloudvendor.cloudvendor.LLDProblems.FileSystem.PrintAllMovies;

import java.util.List;

public class File implements Movie {
    private final String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void print(List<String> curr) {
        curr.add(this.fileName);
        StringBuilder ans = new StringBuilder();

        for (String s: curr) {
            ans.append("/").append(s);
        }

        System.out.println(ans);
        curr.remove(this.fileName);
    }
}
