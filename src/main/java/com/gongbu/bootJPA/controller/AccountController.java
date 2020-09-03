package com.gongbu.bootJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gongbu.bootJPA.domain.Account;
import com.gongbu.bootJPA.service.AccountService;

@RestController
@RequestMapping("/account/*")
public class AccountController {
	
	@Autowired
	private AccountService accountService;

	@PostMapping("/saveAccount")
	public void saveAccount(String userId, String name) {
		accountService.saveAccount(userId, name);
	}
	
	@PostMapping("/getAccountList")
	public List<Account> getAccount(String userId) {
		return accountService.accountList(userId);
	}
	
	@PostMapping("/updateAccount")
	public Account updateAccount(Long accountId, String name) {
		return accountService.updateAccount(accountId, name);
	}
}
