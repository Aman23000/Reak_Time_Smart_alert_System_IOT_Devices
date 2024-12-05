package com.example;

public interface AlertStrategy {
    void escalate(String deviceId, String message);
}
