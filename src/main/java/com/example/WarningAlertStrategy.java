package com.example;

public class WarningAlertStrategy implements AlertStrategy {
    @Override
    public void escalate(String deviceId, String message) {
        System.out.println("Warning Alert! Check Device " + deviceId + ": " + message);
    }
}
