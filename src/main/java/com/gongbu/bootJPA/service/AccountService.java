package com.gongbu.bootJPA.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gongbu.bootJPA.domain.Account;
import com.gongbu.bootJPA.repository.AccountRepository;

@Service
public class AccountService{
	
	@PersistenceContext
	EntityManager em;
	
	@Autowired AccountRepository accountRepository;
	
	@Transactional
	public List<Account> getAccount() {
		List<Account> account = accountRepository.findAll();
		return account;
	}
}
