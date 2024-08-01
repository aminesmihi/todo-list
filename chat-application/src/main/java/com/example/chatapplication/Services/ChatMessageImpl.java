package com.example.chatapplication.Services;

import com.example.chatapplication.Repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatMessageImpl implements ChatMessage {

    private final MessageRepository messageRepository;
    private final  ChatRoomIntImpl chatRoomService;

    @Override
    public ChatMessage save(com.example.chatapplication.entites.ChatMessage chatmessage) {
        var chatId=chatRoomService.getChatRoomId(
                chatmessage.getSenderId()
                , chatmessage.getReceptientId()
                , true
        ).orElseThrow();
        chatmessage.setChatId(chatId);
        messageRepository.save(chatmessage);
        return (ChatMessage)chatmessage;
    }

    @Override
    public List<com.example.chatapplication.entites.ChatMessage> findChatMessages(String senderId, String recepientId) {
        var ChatId=chatRoomService.getChatRoomId(senderId,recepientId,false);
        return ChatId.map(messageRepository::findChatId).orElse(new ArrayList<>());
    }

}
