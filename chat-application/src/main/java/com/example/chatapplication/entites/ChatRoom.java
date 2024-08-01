package com.example.chatapplication.entites;


import com.example.chatapplication.enums.MessageType;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter @Setter @Builder @AllArgsConstructor @NoArgsConstructor
public class ChatRoom {
    @Id
    private String chatId;
    private String content;
    private String senderId;
    private MessageType recipientId;
}
