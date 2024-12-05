package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class NotificationManagerTest {

    @Test
    void testNotifyObservers() {
        // Create mock observers
        NotificationObserver emailNotifier = mock(NotificationObserver.class);
        NotificationObserver smsNotifier = mock(NotificationObserver.class);

        NotificationManager notificationManager = new NotificationManager();
        notificationManager.addObserver(emailNotifier);
        notificationManager.addObserver(smsNotifier);

        // Trigger an alert
        String message = "Critical Alert: Temperature Spike Detected";
        notificationManager.alert(message);

        // Verify that all observers were notified
        verify(emailNotifier).notify(message);
        verify(smsNotifier).notify(message);
    }
}
