package com.gongbu.bootJPA.service;

import com.gongbu.bootJPA.entity.UserInfo;

public interface UserInfoService {
	public Boolean login(String id, String pw);
	public Boolean registerUser(UserInfo user);
	public UserInfo getUser(String id);
}
