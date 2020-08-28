package com.gongbu.bootJPA.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gongbu.bootJPA.entity.Account;
import com.gongbu.bootJPA.entity.UserAccount;
import com.gongbu.bootJPA.entity.UserAccountId;
import com.gongbu.bootJPA.entity.Users;
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
	
	public void save(Users user, Account account) {
		UserAccount userAccount = new UserAccount();
		userAccount.setAccount(account);
		userAccount.setUser(user);
		em.persist(userAccount);
	}
	
	public void find(String UAId) {
		UserAccount userAccount = em.find(UserAccount.class, UAId);
		Users user = userAccount.getUser();
		Account account = userAccount.getAccount();
		
		System.out.println("user : " + user.toString() + " account : " + account.toString());
	}
}
