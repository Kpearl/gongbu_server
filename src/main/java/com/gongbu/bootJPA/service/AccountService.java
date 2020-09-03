package com.gongbu.bootJPA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gongbu.bootJPA.domain.Account;
import com.gongbu.bootJPA.domain.Friend;
import com.gongbu.bootJPA.domain.FriendState;
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

	public void saveAccount(String userId, Account account) {
		Users user = userRepository.findByUserId(userId);
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
	
	public Account updateAccount(Long accountId, String name) {
		Account account = accountRepository.findById(accountId).get();
		account.setName(name);
		accountRepository.save(account);
		return account;
	}
}
