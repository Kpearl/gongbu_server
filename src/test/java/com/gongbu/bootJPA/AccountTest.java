package com.gongbu.bootJPA;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gongbu.bootJPA.domain.Account;
import com.gongbu.bootJPA.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(classes=Application.class)
@SpringBootTest(classes=Application.class)
public class AccountTest {

	@Autowired
	private AccountService accountService;

	//@Test
	public void saveAccountTest() throws Exception {
		accountService.saveAccount("Test", "test");
	}

	//@Test
	public void getAccountListTest() throws Exception {
		List<Account> result = accountService.accountList("Test");
		
		for(Account a : result ) {
			System.out.println(a.getName() + " " + a.getUser());
		}
	}
	
	//@Test
	public void getAccountTest() throws Exception {
		Account account = accountService.getAccount((long) 8);
		System.out.println(account.toString());
	}
	
	@Test
	public void updateAccountTest() throws Exception {
		Account account = accountService.getAccount((long) 8);
		account.setName("updateAccount");
		Account result = accountService.updateAccount(account);
		System.out.println(result.toString());
	}
}
