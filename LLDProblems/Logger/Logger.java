package com.cloudvendor.cloudvendor.LLDProblems.Logger;

public abstract class Logger {
    private final Logger nextLogger;
    protected final static Integer INFO = 1;
    protected final static Integer DEBUG = 2;
    protected final static Integer ERROR = 3;

    public Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(int level, String message) {
        if (this.nextLogger != null) {
            this.nextLogger.log(level, message);
        }
    }
}
