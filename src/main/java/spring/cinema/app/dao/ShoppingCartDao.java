package spring.cinema.app.dao;

import spring.cinema.app.model.ShoppingCart;
import spring.cinema.app.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    ShoppingCart update(ShoppingCart shoppingCart);
}
