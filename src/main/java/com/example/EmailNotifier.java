package com.example;

public class EmailNotifier implements NotificationObserver {
    @Override
    public void notify(String message) {
        System.out.println("Email Notification: " + message);
    }
}
