package main.java.utils;

import java.util.Date;

public class Logger {
    public void info(Object message) {
        log("INFO", message);
    }

    public void warning(Object message) {
        log("WARNING", message);
    }

    public void error(Object message) {
        log("ERROR", message);
    }

    private void log(String level, Object message) {
        Date timestamp = new Date();
        String logEntry = String.format("[%s] [%s] %s", timestamp, level, message);
        System.out.println(logEntry);
    }
}
