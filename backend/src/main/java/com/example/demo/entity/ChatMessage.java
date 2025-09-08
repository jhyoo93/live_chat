package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * 채팅 메시지 엔티티
 * - 속하는 채팅방 ManyToOne 관계로 표현
 *
 */

@Entity
@Table(name = "chat_message")
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 여러 메시지가 하나의 방에 속하는 다:1관계
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false) // FK 컬럼명
    private ChatRoom room;

    @Column(nullable = false)
    private String sender; // 보내는 사람 닉네임

    @Column(nullable = false, length = 2000)
    private String content; // 메세지 

    private LocalDateTime createdAt = LocalDateTime.now();

    protected ChatMessage() {}
    
    // 연관 관계 설정
    public void setRoom(ChatRoom room) {
        this.room = room;
    }
    
    public void setSender(String sender) {
        this.sender = sender;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    

    // Getter
    public Long getId() {
        return id;
    }
    
    public ChatRoom getRoom() {
        return room;
    }
    
    public String getSender() {
        return sender;
    }
    
    public String getContent() {
        return content;
    }
    
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    
}
