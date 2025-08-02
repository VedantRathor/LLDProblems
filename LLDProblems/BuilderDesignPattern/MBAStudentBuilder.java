package com.cloudvendor.cloudvendor.LLDProblems.BuilderDesignPattern;

public class MBAStudentBuilder extends StudentBuilder {
    public MBAStudentBuilder(Integer rollNumber) {
        super(rollNumber);
    }
    @Override
    public StudentBuilder addSubject(String subjectName) {
        super.addSubject(subjectName);
        return this;
    }
}
