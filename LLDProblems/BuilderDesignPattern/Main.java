package com.cloudvendor.cloudvendor.LLDProblems.BuilderDesignPattern;

public class Main {
    public static void main(String varchar[]) {
        System.out.println("LLD for builder-design-pattern is running...");
        StudentBuilder engineeringStudentBuilder = new EngineeringStudentBuilder(1001);
        Student engStudent = engineeringStudentBuilder.setMotherName("Sunila").setFatherName("Father").setName("Vedant Rathore")
                .addSubject("DSA")
                .addSubject("OS")
                .addSubject("CP")
                .build();

        engStudent.printAllDetails();

    }
}
