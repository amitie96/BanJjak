package com.mysite.banjjak.dao;

import java.util.Map;

import com.mysite.banjjak.model.User;

public interface UserDao {

	void join(User user);

	User userinfo(String userId);

	void updateUserInfo(Map<String, Object> userInfo);
}
