package spring.cinema.app.service;

import spring.cinema.app.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}
