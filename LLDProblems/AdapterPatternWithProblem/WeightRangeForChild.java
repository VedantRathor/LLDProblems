package com.cloudvendor.cloudvendor.LLDProblems.AdapterPatternWithProblem;

public class WeightRangeForChild implements WeightRange {
    @Override
    public Integer getMaxHealthyWeight() {
        return 30;
    }
}
