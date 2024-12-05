package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;


class MultiObserverNotificationTest {

    @Test
    void testMultipleObservers() {
        // Create mock observers
        NotificationObserver emailNotifier = mock(NotificationObserver.class);
        NotificationObserver smsNotifier = mock(NotificationObserver.class);

        NotificationManager notificationManager = new NotificationManager();
        notificationManager.addObserver(emailNotifier);
        notificationManager.addObserver(smsNotifier);

        // Trigger a notification
        String message = "Power Surge Detected";
        notificationManager.alert(message);

        // Verify that all observers were notified
        verify(emailNotifier).notify(message);
        verify(smsNotifier).notify(message);
    }
}
