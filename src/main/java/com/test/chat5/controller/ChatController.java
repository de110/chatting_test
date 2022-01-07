// package com.test.chat5.controller;

// import com.test.chat5.dto.ChatMessageDto;
// import com.test.chat5.service.ChatService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.messaging.handler.annotation.MessageMapping;
// import org.springframework.messaging.handler.annotation.SendTo;
// import org.springframework.stereotype.Controller;

// import lombok.RequiredArgsConstructor;

// @RequiredArgsConstructor
// @Controller
// public class ChatController {
// @Autowired
// private ChatService chatService;

// @MessageMapping("/receive")
// @SendTo("/send")
// public void chattingHandler(ChatMessageDto chatting) {
// // return chatService.chattingHandler(chatting);
// try {
// chatService.save(chatting);
// } catch (Exception e) {
// }
// }
// }
package com.test.chat5.controller;

import com.test.chat5.model.ChatMessage;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import org.springframework.messaging.simp.SimpMessageHeaderAccessor;

@Controller
public class ChatController {

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ChatMessage addUser(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }
}
