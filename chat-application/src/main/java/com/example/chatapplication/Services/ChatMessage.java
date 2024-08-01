package com.example.chatapplication.Services;

import java.util.List;

public interface ChatMessage {
    public ChatMessage save(com.example.chatapplication.entites.ChatMessage chatMessage);
    public List<com.example.chatapplication.entites.ChatMessage> findChatMessages(String senderId, String recepientId);

}
