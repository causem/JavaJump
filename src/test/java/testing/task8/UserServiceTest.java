package testing.task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

class UserServiceTest {

    @Test
    void shouldThrowExceptionWhenUserNotFound() {
        // given
        UserRepository mockUserRepository = mock(UserRepository.class);
        UserService userService = new UserService(mockUserRepository);
        long userId = 33l;
        doThrow(new IllegalArgumentException("User not found"))
                .when(mockUserRepository).deleteById(userId);

        // when
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            userService.deleteById(userId);
        });

        // then
        assertEquals("User not found", e.getMessage());
    }

}