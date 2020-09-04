package com.gongbu.bootJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gongbu.bootJPA.domain.Account;
import com.gongbu.bootJPA.domain.Sharer;
import com.gongbu.bootJPA.repository.AccountRepository;
import com.gongbu.bootJPA.repository.SharerRepository;

@Service
@Transactional
public class SharerService {
	
	@Autowired
	private SharerRepository sharerRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	public void addSharer(Long accountId, Long userId) {
		Account account = accountRepository.findById((long) accountId).get();
		Sharer sharer = new Sharer(account);
		account.setSharer(sharer);
		sharer.setUserId(userId);
		sharerRepository.save(sharer);
	}
	
	public List<Sharer> getSharerList(Account account) {
		return sharerRepository.findByAccount(account);
	}
	
	public Sharer getSharer(Long sharerId) {
		return sharerRepository.findById(sharerId).get();
	}
	
	public void deleteSharer(Sharer sharer) {
		sharerRepository.delete(sharer);
	}
}
