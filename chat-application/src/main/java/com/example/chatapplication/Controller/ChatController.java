package com.example.chatapplication.Controller;

import com.example.chatapplication.Services.ChatMessageImpl;
import com.example.chatapplication.entites.ChatRoom;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor
public class ChatController {

    private final ChatMessageImpl chatMessage;

    @MessageMapping("chat.sendMessage")
    @SendTo("/topic/public")
    public ChatRoom sendMessage(@Payload ChatRoom chatmsg){
        return chatmsg;
    }
    @MessageMapping("messages/{senderId}/{receptientId}")
        @SendTo("/topic/public")
        public ChatRoom AddUser(@Payload ChatRoom chatRoom, SimpMessageHeaderAccessor headerAccessor){
            headerAccessor.getSessionAttributes().put("username", chatRoom.getSenderId());
                return chatRoom;
        }
}
