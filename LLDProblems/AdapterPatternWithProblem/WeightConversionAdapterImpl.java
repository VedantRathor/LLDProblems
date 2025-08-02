package com.cloudvendor.cloudvendor.LLDProblems.AdapterPatternWithProblem;

public class WeightConversionAdapterImpl implements WeightConversionAdapter {
    private final WeightRange weightRange;
    public WeightConversionAdapterImpl(WeightRange weightRange) {
        this.weightRange = weightRange;
    }
    @Override
    public Integer convertWeightFromPoundsToKg() {
        Integer wtInPounds = this.weightRange.getMaxHealthyWeight();
        return (wtInPounds * 45);
    }
}
