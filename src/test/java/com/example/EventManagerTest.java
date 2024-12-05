package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EventManagerTest {

    @Test
    void testLogEvent() {
        EventManager eventManager = new EventManager();
        Event event = new Event("ALERT", "Device1", "Temperature Spike Detected");

        // Log an event
        eventManager.logEvent(event);

        // Verify the event log size and content
        assertEquals(1, eventManager.getEventLog().size());
        assertEquals("ALERT", eventManager.getEventLog().get(0).getType());
        assertEquals("Device1", eventManager.getEventLog().get(0).getDeviceId());
        assertEquals("Temperature Spike Detected", eventManager.getEventLog().get(0).getMessage());
    }
}
