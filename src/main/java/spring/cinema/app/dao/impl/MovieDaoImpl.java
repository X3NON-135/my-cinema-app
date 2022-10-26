package spring.cinema.app.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import spring.cinema.app.dao.AbstractDao;
import spring.cinema.app.dao.MovieDao;
import spring.cinema.app.model.Movie;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
