package com.cloudvendor.cloudvendor.LLDProblems.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String varchar[]) {
        System.out.println("LLD for builder-design-pattern is running...");
        StudentBuilder engineeringStudentBuilder = new EngineeringStudentBuilder(1001);
        Student engStudent = engineeringStudentBuilder
                .setMotherName("XYZ")
                .setFatherName("ABC")
                .setName("Vedant Rathore")
                .addSubject("DSA")
                .addSubject("OS")
                .addSubject("CP")
                .build();

        engStudent.printAllDetails();

        Map<Integer, List<Integer>> mp = new HashMap<>();
        mp.put(1, new ArrayList<>(10));
        mp.put(2, new ArrayList<>(10));
        mp.put(3, new ArrayList<>(10));
    }
}
