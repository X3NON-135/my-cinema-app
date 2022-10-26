package spring.cinema.app.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import spring.cinema.app.dao.AbstractDao;
import spring.cinema.app.dao.CinemaHallDao;
import spring.cinema.app.model.CinemaHall;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
