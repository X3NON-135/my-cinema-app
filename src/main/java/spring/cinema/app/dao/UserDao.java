package spring.cinema.app.dao;

import java.util.Optional;
import spring.cinema.app.model.User;

public interface UserDao {
    User add(User user);

    Optional<User> get(Long id);

    Optional<User> findByEmail(String email);
}
