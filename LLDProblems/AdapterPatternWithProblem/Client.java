package com.cloudvendor.cloudvendor.LLDProblems.AdapterPatternWithProblem;

public class Client {
    public static void main(String varchar[]) {
        WeightRange weightRange = new WeightRangeForAdult();
        WeightConversionAdapter weightConversionAdapter = new WeightConversionAdapterImpl(weightRange);
        System.out.println(weightConversionAdapter.convertWeightFromPoundsToKg());
    }
}
