package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger generalLogger = LoggerFactory.getLogger(App.class);
    private static final Logger errorLogger = LoggerFactory.getLogger("com.myapp.error");
    private static final Logger deviceStatusLogger = LoggerFactory.getLogger("com.myapp.device");

    public static void main(String[] args) {
        // Лог для общего потока (stdout)
        generalLogger.info("Application started");

        // Лог для ошибок (stderr)
        errorLogger.error("An error occurred while starting the application");

        // Лог для статуса устройства (stdout)
        deviceStatusLogger.info("Device status: All systems operational");

        // Другие логи
        for (int i = 0; i < 3; i++) {
            generalLogger.info("Running task " + i);
            errorLogger.error("Error in task " + i);
            deviceStatusLogger.info("Device status updated for task " + i);
        }


    }
    public double sanitizeDouble(double value) {
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            return 0.0; // Или любое другое значение по умолчанию
        }
        return value;
    }


}
