package pl.kurkova.findProgrammingBuddy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.kurkova.findProgrammingBuddy.controller.exception.UserNotFoundException;
import pl.kurkova.findProgrammingBuddy.dto.UserDto;
import pl.kurkova.findProgrammingBuddy.mapper.TechnologyMapper;
import pl.kurkova.findProgrammingBuddy.mapper.UserMapper;
import pl.kurkova.findProgrammingBuddy.service.UserService;

import java.util.List;


@RequestMapping("/v1")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping(value = "/users")
    public List<UserDto> getUsers(){
       return userMapper.mapToUsersListDto(userService.getAllUsers());
    }

    @PostMapping(value = "/user")
    public void createUser(@RequestBody UserDto userDto){
        userService.saveUser(userMapper.mapToUser(userDto));
    }

    @GetMapping(value = "/user")
    public UserDto getUser(@RequestParam Long userId) throws UserNotFoundException{
        return userMapper.mapToUserDto(userService.getUserById(userId).orElseThrow(UserNotFoundException::new));
    }

    @DeleteMapping(value = "/user")
    public void deleteUser(@RequestParam Long userId) throws UserNotFoundException{
        if(userService.getUserById(userId).isPresent()){
            userService.deleteUser(userId);
        } else{
            throw new UserNotFoundException();
        }
    }

}
