package com.gongbu.bootJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gongbu.bootJPA.domain.Account;
import com.gongbu.bootJPA.domain.Sharer;
import com.gongbu.bootJPA.service.SharerService;

@RestController
@RequestMapping("/sharer/*")
public class SharerController {
	
	@Autowired
	private SharerService sharerService;
	
	@PostMapping("/addSharer")
	public void addSharer(Long accountId, Long userId) {
		sharerService.addSharer(accountId, userId);
	}
	
	@PostMapping("/getSharerList")
	public List<Sharer> getShrerList(Account account) {
		return sharerService.getSharerList(account);
	}
	
	@PostMapping("/getSharer")
	public Sharer getSharer(Long sharerId) {
		return sharerService.getSharer(sharerId);
	}
	
	@PostMapping("/deleteSharer")
	public void deleteSharer(Sharer sharer) {
		sharerService.deleteSharer(sharer);
	}
}
