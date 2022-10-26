package spring.cinema.app.service.mapper;

public interface ResponseDtoMapper<D, T> {
    D mapToDto(T t);
}
