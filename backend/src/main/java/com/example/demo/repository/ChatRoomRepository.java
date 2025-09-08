package com.example.demo.repository;

import com.example.demo.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA가 구현체를 자동 생성해 주는 Repository 인터페이스
 * 기본 CRUD(findAll, findById, save)등 제공
 */
public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {}
