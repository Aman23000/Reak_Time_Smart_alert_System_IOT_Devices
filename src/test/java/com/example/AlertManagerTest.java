package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class AlertManagerTest {

    @Test
    void testCriticalAlertStrategy() {
        // Mock the AlertStrategy interface instead of the class
        AlertStrategy criticalStrategy = mock(AlertStrategy.class);

        AlertManager alertManager = new AlertManager();
        alertManager.setStrategy(criticalStrategy);

        // Trigger alert
        String deviceId = "Device1";
        String message = "Temperature Spike Detected";
        alertManager.triggerAlert(deviceId, message);

        // Verify that the escalate method was called
        verify(criticalStrategy).escalate(deviceId, message);
    }

    @Test
    void testWarningAlertStrategy() {
        // Mock the AlertStrategy interface instead of the class
        AlertStrategy warningStrategy = mock(AlertStrategy.class);

        AlertManager alertManager = new AlertManager();
        alertManager.setStrategy(warningStrategy);

        // Trigger alert
        String deviceId = "Device2";
        String message = "Power Fluctuation Detected";
        alertManager.triggerAlert(deviceId, message);

        // Verify that the escalate method was called
        verify(warningStrategy).escalate(deviceId, message);
    }
}
