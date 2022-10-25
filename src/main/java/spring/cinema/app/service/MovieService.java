package spring.cinema.app.service;

import java.util.List;
import spring.cinema.app.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
