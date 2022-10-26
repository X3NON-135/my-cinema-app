package spring.cinema.app.dao;

import java.util.List;
import java.util.Optional;
import spring.cinema.app.model.CinemaHall;

public interface CinemaHallDao {
    CinemaHall add(CinemaHall cinemaHall);

    Optional<CinemaHall> get(Long id);

    List<CinemaHall> getAll();
}
