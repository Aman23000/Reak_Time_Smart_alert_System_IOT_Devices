package com.example;

public class Event {
    private String type;
    private String deviceId;
    private String message;

    public Event(String type, String deviceId, String message) {
        this.type = type;
        this.deviceId = deviceId;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getMessage() {
        return message;
    }
}
