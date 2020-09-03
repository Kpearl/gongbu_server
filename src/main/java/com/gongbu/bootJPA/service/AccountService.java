package com.gongbu.bootJPA.service;

import java.util.List;

import org.h2.engine.UserAggregate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gongbu.bootJPA.domain.Account;
import com.gongbu.bootJPA.domain.Users;
import com.gongbu.bootJPA.repository.AccountRepository;
import com.gongbu.bootJPA.repository.UserRepository;

@Service
@Transactional
public class AccountService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AccountRepository accountRepository;

	public void saveAccount(String userId, String name) {
		Users user = userRepository.findByUserId(userId);
		Account account = new Account();
		account.setName(name);
		account.setUser(user);
		accountRepository.save(account);
	}

	public List<Account> accountList(String userId) {
		Users user = userRepository.findByUserId(userId);
		if(accountRepository.existsByUserId(user.getId())) {
			return accountRepository.findByUserId(user.getId());
		}
		return null;
	}
	
	public Account getAccount(Long accountId) {
		return accountRepository.findById(accountId).get();
	}
	
	public Account updateAccount(Account account) {
		accountRepository.save(account);
		return account;
	}
	
	public void deleteAccount(Account account) {
		accountRepository.delete(account);
	}
}
