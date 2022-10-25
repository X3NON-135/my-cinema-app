package spring.cinema.app.dao;

import java.util.List;
import spring.cinema.app.model.Order;
import spring.cinema.app.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
