package com.example;

public class CriticalAlertStrategy implements AlertStrategy {
    @Override
    public void escalate(String deviceId, String message) {
        System.out.println("Critical Alert! Immediate attention required for Device " + deviceId + ": " + message);
    }
}
