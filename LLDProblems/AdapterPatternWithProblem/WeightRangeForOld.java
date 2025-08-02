package com.cloudvendor.cloudvendor.LLDProblems.AdapterPatternWithProblem;

public class WeightRangeForOld implements WeightRange {
    @Override
    public Integer getMaxHealthyWeight() {
        return 70;
    }
}
