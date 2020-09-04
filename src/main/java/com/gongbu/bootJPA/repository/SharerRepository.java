package com.gongbu.bootJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gongbu.bootJPA.domain.Account;
import com.gongbu.bootJPA.domain.Sharer;

public interface SharerRepository extends JpaRepository<Sharer, Long>{
	List<Sharer> findByAccount(Account account);
}
