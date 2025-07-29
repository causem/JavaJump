package testing.task7;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserServiceTest {

    @Test
    void shouldReturnUserById() {
        // given
        UserRepository mockUserRepository = mock(UserRepository.class);
        User expectedUser = new User(1L, "Jan Kowalski");
        when(mockUserRepository.findById(1L)).thenReturn(expectedUser);

        // when
        UserService userService = new UserService(mockUserRepository);

        //then
        User result = userService.findById(1L);
    }

}