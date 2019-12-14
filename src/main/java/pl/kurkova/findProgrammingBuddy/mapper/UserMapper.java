package pl.kurkova.findProgrammingBuddy.mapper;

import org.springframework.stereotype.Component;
import pl.kurkova.findProgrammingBuddy.domain.User;
import pl.kurkova.findProgrammingBuddy.dto.UserDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    public User mapToUser (final UserDto userDto){
        return new User(
                userDto.getId(),
                userDto.getUserName(),
                userDto.getCity(),
                userDto.getLevelOfProgramming(),
                userDto.getSizeOfTeam(),
                userDto.getTechnologiesToStudy()
        );
    }

    public UserDto mapToUserDto(final User user){
        return new UserDto(
                user.getId(),
                user.getUserName(),
                user.getCity(),
                user.getLevelOfProgramming(),
                user.getSizeOfTeam(),
                user.getTechnologiesToStudy()
        );
    }

    public List<UserDto> mapToUsersListDto(final List<User> usersList){
        return usersList.stream()
                .map(t-> new UserDto (t.getId(), t.getUserName(), t.getCity(), t.getLevelOfProgramming(), t.getSizeOfTeam(),t.getTechnologiesToStudy()))
                .collect(Collectors.toList());
    }
}
