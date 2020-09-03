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

	@PostMapping("/getAccount")
	public List<Account> getCategory(String id) {
		return accountService.accountList(id);
	}
}
