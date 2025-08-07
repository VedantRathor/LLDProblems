package com.cloudvendor.cloudvendor.LLDProblems.BuilderDesignPattern;

import java.util.List;

public class Student {
    private Integer rollNumber;
    private String name;
    private String fatherName;
    private String motherName;
    private List<String> subjectList;

    public Student(StudentBuilder studentBuilder) {
        this.rollNumber = studentBuilder.getRollNumber();
        this.name = studentBuilder.getName();
        this.fatherName = studentBuilder.getFatherName();
        this.motherName = studentBuilder.getMotherName();
        this.subjectList = studentBuilder.getSubjectList();
    }

    public void printAllDetails() {
        System.out.println(this.rollNumber);
        System.out.println(this.name);
        System.out.println(this.motherName);
        System.out.println(this.fatherName);

        for (String subject: subjectList) {
            System.out.print(subject + " ");
        }
    }
}
