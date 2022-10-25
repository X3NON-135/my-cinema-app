package spring.cinema.app.service.mapper;

import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import spring.cinema.app.dto.response.OrderResponseDto;
import spring.cinema.app.model.Order;
import spring.cinema.app.model.Ticket;

@Component
public class OrderMapper implements ResponseDtoMapper<OrderResponseDto, Order> {
    @Override
    public OrderResponseDto mapToDto(Order order) {
        OrderResponseDto responseDto = new OrderResponseDto();
        responseDto.setId(order.getId());
        responseDto.setUserId(order.getUser().getId());
        responseDto.setOrderTime(order.getOrderTime());
        responseDto.setTicketIds(order.getTickets()
                .stream()
                .map(Ticket::getId)
                .collect(Collectors.toList()));
        return responseDto;
    }
}
