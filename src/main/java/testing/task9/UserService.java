package testing.task9;

public class UserService {
    private final NotificationSender notificationSender;

    public UserService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void notifyUserFiveTimes(String message) {
        for (int i = 0; i < 5; i++) {
            notificationSender.sendNotification(message);
        }
    }
}
