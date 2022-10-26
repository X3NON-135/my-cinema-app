package spring.cinema.app.dao;

import java.util.Optional;
import spring.cinema.app.model.Role;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getByName(String roleName);
}
