package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * 채팅방을 나타내는 엔티티
 * JPA가 이 클래스를 보고 테이블 스키마를 생성
 */
@Entity
@Table(name = "chat_room")
public class ChatRoom {
  
    @Id     
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 데이터베이스 자동 증가 컬럼
    private Long id;

    @Column(nullable = false)
    private String name;
    private LocalDateTime createdAt = LocalDateTime.now();

    // JPA는 기본 생성자를 필요
    protected ChatRoom() {}
    
    public ChatRoom(String name) {
        this.name = name;
    }

    // Getter
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    
}
