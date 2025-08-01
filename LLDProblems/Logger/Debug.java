package com.cloudvendor.cloudvendor.LLDProblems.Logger;

public class Debug extends Logger {
    public Debug(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(int level, String message) {
        if (level == Logger.DEBUG) {
            System.out.println("Debug: " + message);
        } else super.log(level, message);
    }
}
