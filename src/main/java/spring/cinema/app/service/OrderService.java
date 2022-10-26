package spring.cinema.app.service;

import java.util.List;
import spring.cinema.app.model.Order;
import spring.cinema.app.model.ShoppingCart;
import spring.cinema.app.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
