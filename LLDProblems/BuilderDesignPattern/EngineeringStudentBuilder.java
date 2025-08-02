package com.cloudvendor.cloudvendor.LLDProblems.BuilderDesignPattern;

public class EngineeringStudentBuilder extends StudentBuilder {
    public EngineeringStudentBuilder(Integer rollNumber) {
        super(rollNumber);
    }
    @Override
    public StudentBuilder addSubject(String subjectName) {
        super.addSubject(subjectName);
        return this;
    }
}
