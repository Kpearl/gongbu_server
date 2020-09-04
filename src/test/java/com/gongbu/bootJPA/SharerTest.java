package com.gongbu.bootJPA;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gongbu.bootJPA.domain.Account;
import com.gongbu.bootJPA.domain.Sharer;
import com.gongbu.bootJPA.service.AccountService;
import com.gongbu.bootJPA.service.SharerService;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(classes=Application.class)
@SpringBootTest(classes=Application.class)
public class SharerTest {

	@Autowired
	private SharerService sharerService;
	
	@Autowired
	private AccountService accountService;
	
	//@Test
	public void addSharerTest() throws Exception {
		sharerService.addSharer((long) 5, (long) 2);
	}
	
	//@Test
	public void getSharerListTest() throws Exception {
		Account account = accountService.getAccount((long) 8);
		List<Sharer> result = sharerService.getSharerList(account);
		
		for(Sharer u : result) {
			System.out.println(u.toString());
		}
	}
	
	@Test
	public void deleteSharerTest() throws Exception {
		Sharer sharer = sharerService.getSharer((long) 7);
		sharerService.deleteSharer(sharer);
	}
}
