package com.mysite.banjjak.service;

import java.util.Map;

import com.mysite.banjjak.model.User;

public interface UserService {

	void join(User user);

	User getUserByUsername(String username);

	void updateUserInfo(Map<String, Object> userInfo);

	boolean login(User userInfo);

}
