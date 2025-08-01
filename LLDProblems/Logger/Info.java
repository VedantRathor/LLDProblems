package com.cloudvendor.cloudvendor.LLDProblems.Logger;

public class Info extends Logger {
    public Info(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(int level, String message) {
        if (level == Logger.INFO) {
            System.out.println("Info: " + message);
        } else super.log(level, message);
    }
}
