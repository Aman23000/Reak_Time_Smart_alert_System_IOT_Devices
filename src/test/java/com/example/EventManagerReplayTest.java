package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EventManagerReplayTest {

    @Test
    void testReplayEvents() {
        EventManager eventManager = new EventManager();

        // Add events to the event manager
        Event event1 = new Event("ALERT", "Device1", "Temperature Spike Detected");
        Event event2 = new Event("INFO", "Device2", "Device Operating Normally");
        eventManager.logEvent(event1);
        eventManager.logEvent(event2);

        // Verify the number of events logged
        assertEquals(2, eventManager.getEventLog().size());
    }
}
