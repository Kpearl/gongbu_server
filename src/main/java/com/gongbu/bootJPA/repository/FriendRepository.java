package com.gongbu.bootJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gongbu.bootJPA.entity.Friend;

public interface FriendRepository extends JpaRepository<Friend, Long> {

}
