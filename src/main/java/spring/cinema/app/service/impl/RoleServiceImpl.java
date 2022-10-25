package spring.cinema.app.service.impl;

import java.util.NoSuchElementException;
import org.springframework.stereotype.Service;
import spring.cinema.app.dao.RoleDao;
import spring.cinema.app.model.Role;
import spring.cinema.app.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(roleName).orElseThrow(() ->
                new NoSuchElementException("Not found Role by roleName=" + roleName));
    }
}
