package com.example.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ChatMessage;
import com.example.demo.entity.ChatRoom;

/**
 * 메시지 히스토리 페이지 조회 메서드를 메서드 이름 규칙으로 선언
 * 방 기준으로 최신순 페이지 조회
 */
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
    Page<ChatMessage> findByRoomOrderByCreatedAtDesc(ChatRoom room, Pageable pageable);
}

 