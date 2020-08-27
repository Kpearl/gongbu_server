package com.gongbu.bootJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gongbu.bootJPA.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
