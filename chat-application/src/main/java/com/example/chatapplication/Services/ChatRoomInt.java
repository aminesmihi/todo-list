package com.example.chatapplication.Services;

import com.example.chatapplication.entites.ChatRoom;

import java.util.Optional;

public interface ChatRoomInt {

    public Optional<String> getChatRoomId(String sender,String reciptient,Boolean flag);

}
