package com.db.edu.logger.api;


import com.db.edu.logger.businesslogic.services.LoggerMessageFilter;
import com.db.edu.logger.businesslogic.services.LoggerMessageFormatter;
import com.db.edu.logger.dal.LoggerSaver;

public class LoggerController
{
    private LoggerSaver saver = new LoggerSaver();
    private LoggerMessageFilter filter = new LoggerMessageFilter();
    private LoggerMessageFormatter formatter =new LoggerMessageFormatter();
    /**
     *
     * @param message - to be logged
     */
    public void log(String message) {
        if (filter.MessageFiltered(message)){
            handle(message);
        }


    }

    private void handle(String message) {
        saver.save(formatter.formateMessage(message));
    }
}
