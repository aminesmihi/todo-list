package com.example.chatapplication.Controller;

import com.example.chatapplication.Services.ChatMessage;
import com.example.chatapplication.Services.ChatMessageImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MessageController {
    private final ChatMessageImpl chatMessage;

    @GetMapping(path = "/messages/{senderId}/{recepientId}")
    public List<com.example.chatapplication.entites.ChatMessage> AllMsgs(
            @PathVariable String senderId,
            @PathVariable String recepientId
            ){
        return null;

    }


}
