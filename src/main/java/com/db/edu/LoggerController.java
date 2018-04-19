package com.db.edu;


public class LoggerController
{
    private LoggerSaver saver = new LoggerSaver();
    /**
     *
     * @param message - DDD: Domain Language first
     */
    public void log(String message) {
        //   System.out.println(message);
        saver.save(message);
    }
}
