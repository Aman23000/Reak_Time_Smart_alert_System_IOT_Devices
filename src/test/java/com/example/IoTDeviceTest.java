package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class IoTDeviceTest {

    @Test
    void testSimulateEvent() {
        EventManager eventManager = new EventManager();
        IoTDevice device = new IoTDevice("Device1", eventManager);

        // Simulate an event
        device.simulateEvent();

        // Verify that at least one event was logged
        assertFalse(eventManager.getEventLog().isEmpty());
    }
}
