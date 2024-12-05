package com.example;

public class AlertManager {
    private AlertStrategy strategy;

    public void setStrategy(AlertStrategy strategy) {
        this.strategy = strategy;
    }

    public void triggerAlert(String deviceId, String message) {
        if (strategy != null) {
            strategy.escalate(deviceId, message);
        } else {
            System.out.println("No escalation strategy set.");
        }
    }
}
