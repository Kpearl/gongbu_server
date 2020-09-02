package com.gongbu.bootJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gongbu.bootJPA.domain.Friend;

public interface FriendRepository extends JpaRepository<Friend, Long> {
	List<Friend> findByUserId(Long id);
	Boolean existsByUserId(Long userId);
}
