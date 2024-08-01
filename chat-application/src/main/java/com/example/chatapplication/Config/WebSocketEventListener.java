package com.example.chatapplication.Config;

import com.example.chatapplication.entites.ChatRoom;
import com.example.chatapplication.enums.MessageType;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
@RequiredArgsConstructor
public class WebSocketEventListener {

    private final SimpMessageSendingOperations msgTemplate;
    @EventListener
    public void HandlDisconnectEvent(SessionDisconnectEvent event){

    }
}
