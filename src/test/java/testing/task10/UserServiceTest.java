package testing.task10;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserServiceTest {

    @Test
    void shouldReturnThreeUsers() {
        // given
        UserRepository mockUserRepository = mock(UserRepository.class);
        List<User> mockUsers = Arrays.asList(
                new User(1L, "Anna"),
                new User(2L, "Bartek"),
                new User(3L, "Celina")
        );
        when(mockUserRepository.getAllUsers()).thenReturn(mockUsers);

        // when
        UserService userService = new UserService(mockUserRepository);
        List<User> result = userService.getAllUsers();

        // then
        assertEquals(3, result.size());
        assertEquals("Anna", result.get(0).getName());
        assertEquals("Bartek", result.get(1).getName());
        assertEquals("Celina", result.get(2).getName());


    }

}