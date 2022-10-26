package spring.cinema.app.service.mapper;

import org.springframework.stereotype.Component;
import spring.cinema.app.dto.response.UserResponseDto;
import spring.cinema.app.model.User;

@Component
public class UserMapper implements ResponseDtoMapper<UserResponseDto, User> {
    @Override
    public UserResponseDto mapToDto(User user) {
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setId(user.getId());
        responseDto.setEmail(user.getEmail());
        return responseDto;
    }
}
