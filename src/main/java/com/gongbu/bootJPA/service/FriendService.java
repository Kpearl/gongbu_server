package com.gongbu.bootJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gongbu.bootJPA.domain.Friend;
import com.gongbu.bootJPA.domain.FriendState;
import com.gongbu.bootJPA.domain.Users;
import com.gongbu.bootJPA.repository.FriendRepository;
import com.gongbu.bootJPA.repository.UserRepository;

@Service
@Transactional
public class FriendService {

	@Autowired
	private FriendRepository friendRepository;

	@Autowired
	private UserRepository userRepository;

	public Friend followFriend(String user, String target) {
		Users userInfo = userRepository.findByUserId(user);
		Users targetInfo = userRepository.findByUserId(target);
		Friend userFriend, targetFriend;

		if (!friendRepository.existsByUserId(userInfo.getId())) {
			userFriend = new Friend(userInfo.getId(), FriendState.FOLLOWUP, targetInfo.getId());
		} else {
			List<Friend> userList = friendRepository.findByUserId(userInfo.getId());
			userFriend = checkState(userList, targetInfo.getId(), FriendState.FOLLOW);
		}

		if (!friendRepository.existsByUserId(targetInfo.getId())) {
			targetFriend = new Friend(targetInfo.getId(), FriendState.LETFOLLOW, userInfo.getId());
		} else {
			List<Friend> targetList = friendRepository.findByUserId(targetInfo.getId());
			targetFriend = checkState(targetList, userInfo.getId(), FriendState.FOLLOW);
		}
		userInfo.getFriend().add(userFriend);
		targetInfo.getFriend().add(targetFriend);

		friendRepository.save(userFriend);
		friendRepository.save(targetFriend);

		return userFriend;
	}

	public void unFollowFriend(String user, String target) {
		Users userInfo = userRepository.findByUserId(user);
		Users targetInfo = userRepository.findByUserId(target);
		
		if (friendRepository.existsByUserId(userInfo.getId())) {
			List<Friend> userList = friendRepository.findByUserId(userInfo.getId());
			Friend userFriend = checkState(userList, targetInfo.getId(), FriendState.UNFOLLOW);
			friendRepository.delete(userFriend);
			userFriend = null;
		}

		if (friendRepository.existsByUserId(targetInfo.getId())) {
			List<Friend> targetList = friendRepository.findByUserId(targetInfo.getId());
			Friend targetFriend = checkState(targetList, userInfo.getId(), FriendState.UNFOLLOW);
			friendRepository.delete(targetFriend);
			targetFriend = null;
		}
	}

	public Friend checkState(List<Friend> friendList, Long target, FriendState state) {
		for (Friend f : friendList) {
			if (target.equals(f.getTargetId())) {
				if (state.equals(FriendState.UNFOLLOW)) {
					return f;
				} else {
					return f;
				}
			}
		}
		return null;
	}

	public List<Friend> friendList(String id) {
		Users user = userRepository.findByUserId(id);
		List<Friend> friendList = null;
		if (friendRepository.existsByUserId(user.getId())) {
			friendList = friendRepository.findByUserId(user.getId());
		}
		return friendList;
	}
}
