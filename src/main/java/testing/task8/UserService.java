package testing.task8;

public class UserService implements UserRepository {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void deleteById(long id) {
        userRepository.deleteById(id);
    }
}
