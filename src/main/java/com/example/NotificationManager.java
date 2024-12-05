package com.example;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {
    private List<NotificationObserver> observers = new ArrayList<>();

    public void addObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    public void alert(String message) {
        for (NotificationObserver observer : observers) {
            observer.notify(message);
        }
    }
}
