package com.gongbu.bootJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gongbu.bootJPA.entity.Account;
import com.gongbu.bootJPA.entity.AccountGroup;
import com.gongbu.bootJPA.service.AccountService;

@RestController
@RequestMapping("/account/*")
public class AccountCountroller {

	@Autowired
	private AccountService accountService;

	@PostMapping("/setGroup")
	public Boolean setGroup(AccountGroup accountGroup) {
		return null;
	}
	
	@PostMapping("/getGroup")
	public List<Account> getGroup(String user_id) {
		return null;
	}
	
	@PostMapping("/setPartner")
	public Boolean setPartner(String g_id, String user_id) {
		return null;
	}
	
	@PostMapping("/write")
	public Boolean write(Account account) {
		return null;
	}
	
	@PostMapping("/read")
	public List<Account> read(String id, String g_id) {
		return null;
	}
}
