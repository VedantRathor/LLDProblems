package com.cloudvendor.cloudvendor.LLDProblems.AdapterPatternWithProblem;

public class WeightRangeForAdult implements WeightRange {
    @Override
    public Integer getMaxHealthyWeight() {
        return 50;
    }
}
