package com.example.chatapplication.Repository;

import com.example.chatapplication.entites.ChatRoom;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChatRoomRepository extends MongoRepository<ChatRoom,String> {

    public Optional<ChatRoom> findChatRoomBySenderIdAndRecipientId(String Sender,String recipient);
}
