package com.cloudvendor.cloudvendor.LLDProblems.Logger;

public class Error extends Logger {
    public Error(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(int level, String message) {
        if (level == Logger.ERROR) {
            throw new RuntimeException("Error: " + message);
        } else super.log(level, message);
    }
}
