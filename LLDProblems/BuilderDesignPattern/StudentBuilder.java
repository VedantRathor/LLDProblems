package com.cloudvendor.cloudvendor.LLDProblems.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class StudentBuilder {
    private Integer rollNumber;
    private String name;
    private String fatherName;
    private String motherName;
    private List<String> subjectList;

    protected StudentBuilder(Integer rollNumber) {
        this.rollNumber = rollNumber;
        this.subjectList = new ArrayList<>();
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder addSubject(String subjectName) {
        this.subjectList.add(subjectName);
        return this;
    }

    public Integer getRollNumber() {
        return this.rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public List<String> getSubjectList() {
        return subjectList;
    }

    public Student build() {
        return new Student(this);
    }
}
