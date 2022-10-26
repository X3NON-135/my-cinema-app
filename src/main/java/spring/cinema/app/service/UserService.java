package spring.cinema.app.service;

import java.util.Optional;
import spring.cinema.app.model.User;

public interface UserService {
    User add(User user);

    User get(Long id);

    Optional<User> findByEmail(String email);
}
