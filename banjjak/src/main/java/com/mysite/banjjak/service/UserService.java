package com.mysite.banjjak.service;

import java.util.Map;

import com.mysite.banjjak.model.User;

public interface UserService {

	void join(User user);

	User getUserByUsername(String username);

	Map<String, Object> userInfo(String userId);

	void updateUserInfo(Map<String, Object> userInfo);

}
