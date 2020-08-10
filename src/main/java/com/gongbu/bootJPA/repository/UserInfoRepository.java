package com.gongbu.bootJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gongbu.bootJPA.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, String>{
}
