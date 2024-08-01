package com.example.chatapplication.Repository;

import com.example.chatapplication.entites.Status;
import com.example.chatapplication.entites.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository  extends MongoRepository<User,String> {

    List<User> findAllByStatus(Status status);
    Optional<User> findUserByEmail(String email);
}
