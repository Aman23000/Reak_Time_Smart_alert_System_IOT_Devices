package com.example;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<Event> eventLog = new ArrayList<>();

    public void logEvent(Event event) {
        eventLog.add(event);
    }

    public List<Event> getEventLog() {
        return eventLog;
    }
}
