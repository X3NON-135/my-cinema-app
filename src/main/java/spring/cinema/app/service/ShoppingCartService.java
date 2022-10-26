package spring.cinema.app.service;

import spring.cinema.app.model.MovieSession;
import spring.cinema.app.model.ShoppingCart;
import spring.cinema.app.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
