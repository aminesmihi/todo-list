package com.example.chatapplication.Services;

import com.example.chatapplication.entites.User;

import java.util.List;

public interface UserService {

    public void saveUser(User user);
    public void disconnect(User user);
    public List<User> findAllDisconnect();


}
