package spring.cinema.app.service;

import spring.cinema.app.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
