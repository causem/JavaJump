package testing.task9;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class UserServiceTest {

    @Test
    void shouldCallNotificationFiveTimes() {
        // given
        NotificationSender mockNotificationSender = mock(NotificationSender.class);
        UserService userService = new UserService(mockNotificationSender);

        // when
        userService.notifyUserFiveTimes("Hello User!");

        // then
        verify(mockNotificationSender, times(5)).sendNotification("Hello User!");
    }

}