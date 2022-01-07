// package com.test.chat5.service;

// import javax.transaction.Transactional;

// import com.test.chat5.dto.ChatMessageDto;
// import com.test.chat5.model.ChatMessage;
// import com.test.chat5.repository.ChatRepository;

// import org.springframework.stereotype.Service;

// import lombok.RequiredArgsConstructor;

// @RequiredArgsConstructor
// @Service
// public class ChatService {
// private final ChatRepository chatRepository;

// // public ChatMessage chattingHandler(ChatMessage chatting) {
// // User user = userRepository.findById(chatting.getUser().getId())
// // .orElseThrow(() -> new IllegalArgumentException("가입되지 않은 사용자입니다."));

// // chatting.setUser(user);

// // return chatRepository.save(chatting);
// // }

// @Transactional
// public Long save(ChatMessageDto infoDto) {
// // BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
// // infoDto.setPassword(encoder.encode(infoDto.getPassword()));

// return
// chatRepository.save(ChatMessage.builder().sender(infoDto.getSender()).message(infoDto.getMessage())
// .build()).getId();
// }
// }