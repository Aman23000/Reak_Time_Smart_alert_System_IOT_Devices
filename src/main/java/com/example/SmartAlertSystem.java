package com.example;

public class SmartAlertSystem {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        NotificationManager notificationManager = new NotificationManager();
        AlertManager alertManager = new AlertManager();

        notificationManager.addObserver(new EmailNotifier());
        notificationManager.addObserver(new SMSNotifier());

        alertManager.setStrategy(new CriticalAlertStrategy());

        IoTDevice device1 = new IoTDevice("Device1", eventManager);
        IoTDevice device2 = new IoTDevice("Device2", eventManager);

        for (int i = 0; i < 5; i++) {
            device1.simulateEvent();
            device2.simulateEvent();

            for (Event event : eventManager.getEventLog()) {
                if ("ALERT".equals(event.getType())) {
                    alertManager.triggerAlert(event.getDeviceId(), event.getMessage());
                    notificationManager.alert(event.getMessage());
                }
            }
            System.out.println("----------");
        }
    }
}
