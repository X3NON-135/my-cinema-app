package spring.cinema.app.service.impl;

import java.util.Set;
import org.springframework.stereotype.Service;
import spring.cinema.app.model.Role;
import spring.cinema.app.model.User;
import spring.cinema.app.service.AuthenticationService;
import spring.cinema.app.service.RoleService;
import spring.cinema.app.service.ShoppingCartService;
import spring.cinema.app.service.UserService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService,
                                     RoleService roleService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setRoles(Set.of(roleService.getByName(Role.RoleName.USER.name())));
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
