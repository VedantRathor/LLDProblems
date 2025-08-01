package com.cloudvendor.cloudvendor.LLDProblems.Logger;

public class Main {
    public static void main(String varargs[]) {
        Logger logger = new Info (new Debug(new Error(null)));
        logger.log(1, "there is some error in the main function.");
    }
}
