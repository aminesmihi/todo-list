package com.example.chatapplication.Repository;

import com.example.chatapplication.entites.ChatMessage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MessageRepository extends MongoRepository<ChatMessage,String> {

    List<ChatMessage> findChatId(String chatId);

}
