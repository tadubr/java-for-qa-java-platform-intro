package com.db.edu;

import com.db.edu.logger.api.LoggerController;

public class LoggerIT {
        public static void main(String[] args) {
                LoggerController controller = new LoggerController();
                controller.log("test message");
        }
}


