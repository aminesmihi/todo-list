package com.example.chatapplication.Services;

import com.example.chatapplication.Repository.UserRepository;
import com.example.chatapplication.entites.Status;
import com.example.chatapplication.entites.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public void saveUser(User user) {
        user.setStatus(Status.ONLINE);
        userRepository.save(user);
    }

    @Override
    public void disconnect(User user) {
        user.setStatus(Status.OFFLINE);
        userRepository.save(user);
    }

    @Override
    public List<User> findAllDisconnect() {
        return userRepository.findAllByStatus(Status.ONLINE);
    }
}
