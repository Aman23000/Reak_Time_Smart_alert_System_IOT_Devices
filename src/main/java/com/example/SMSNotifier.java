package com.example;

public class SMSNotifier implements NotificationObserver {
    @Override
    public void notify(String message) {
        System.out.println("SMS Notification: " + message);
    }
}
