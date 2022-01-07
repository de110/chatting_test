package com.test.chat5.model;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

// @Entity
// @Getter
// @Setter
// @NoArgsConstructor
// @AllArgsConstructor
// public class ChatMessage {
// // 메시지 타입 : 입장, 채팅
// public enum MessageType {
// ENTER, TALK, JOIN
// }

// // private MessageType type; // 메시지 타입
// // private String roomId; // 방번호
// // private String sender; // 메시지 보낸사람
// // private String message; // 메시지

// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// private Long id;

// @Column(name = "roomId", unique = true)
// private String roomId;

// @Column(name = "sender")
// private String sender;

// @Column(name = "message")
// private String message;

// @Builder
// public ChatMessage(String roomId, String sender, String message) {
// this.roomId = roomId;
// this.sender = sender;
// this.message = message;
// }
// }

public class ChatMessage {
    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }

    private MessageType type;
    private String content;
    private String sender;

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}