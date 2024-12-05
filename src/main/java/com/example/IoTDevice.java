package com.example;

import java.util.Random;

public class IoTDevice {
    private String id;
    private EventManager eventManager;

    public IoTDevice(String id, EventManager eventManager) {
        this.id = id;
        this.eventManager = eventManager;
    }

    public void simulateEvent() {
        Random random = new Random();
        int eventType = random.nextInt(3);
        String message;

        switch (eventType) {
            case 0 -> message = "Temperature Spike Detected";
            case 1 -> message = "Power Fluctuation Detected";
            default -> message = "Device Operating Normally";
        }

        Event event = new Event(eventType == 2 ? "INFO" : "ALERT", id, message);
        eventManager.logEvent(event);
    }
}
