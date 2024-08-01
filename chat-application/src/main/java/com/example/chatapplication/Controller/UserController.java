package com.example.chatapplication.Controller;

import com.example.chatapplication.Services.UserService;
import com.example.chatapplication.Services.UserServiceImpl;
import com.example.chatapplication.entites.User;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @MessageMapping("/user.addUser")
    @SendTo("/user/topic")
    public User SaveUser(@Payload  User user){
        userService.saveUser(user);
        return user;
    }
    @MessageMapping("/user.disconnectUsers")
    @SendTo("/user/topic")
    public User disconnectUser(@Payload  User user){
        userService.disconnect(user);
        return user;
    }

    @GetMapping("/users")
    public List<User> Allusers(){
        List<User> users=userService.findAllDisconnect();
        return users;
    }


}
