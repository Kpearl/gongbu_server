package com.gongbu.bootJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.gongbu.bootJPA.domain.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
	List<Account> findByUserId(Long userId);
	Account findByName(String name);
	Boolean existsByUserId(Long userId);
}
