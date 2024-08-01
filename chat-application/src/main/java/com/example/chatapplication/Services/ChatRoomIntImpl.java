package com.example.chatapplication.Services;

import com.example.chatapplication.Repository.ChatRoomRepository;
import com.example.chatapplication.entites.ChatRoom;
import com.example.chatapplication.enums.MessageType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChatRoomIntImpl implements ChatRoomInt {

    private final ChatRoomRepository chatRoomRepository;


    @Override
    public Optional<String> getChatRoomId(String senderId, String reciptientId, Boolean createnewRoomifNoteexist) {
        return chatRoomRepository.findChatRoomBySenderIdAndRecipientId(senderId,reciptientId)
                .map(ChatRoom::getChatId)
                .or(()->{
                    if(createnewRoomifNoteexist){
                        String chatId=createChatId(senderId,reciptientId);
                        return Optional.of(chatId);
                    }
                    return Optional.empty();
                });
    }

    private String createChatId(String senderId, String reciptientId) {
        var chatId=String.format("%s_%s",senderId,reciptientId);
        ChatRoom senderRecipient=ChatRoom.builder()
                .chatId(chatId)
                .recipientId(MessageType.valueOf(reciptientId))
                .senderId(senderId)
                .build();
        ChatRoom recipientSender=ChatRoom.builder()
                .chatId(chatId)
                .recipientId(MessageType.valueOf(reciptientId))
                .senderId(senderId)
                .build();
        chatRoomRepository.save(senderRecipient);
        chatRoomRepository.save(recipientSender);
        return  chatId;
    }
}
