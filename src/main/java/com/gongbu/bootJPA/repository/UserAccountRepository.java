package com.gongbu.bootJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gongbu.bootJPA.domain.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {

}
