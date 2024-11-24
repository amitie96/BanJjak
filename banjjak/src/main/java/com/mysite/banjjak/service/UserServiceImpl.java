package com.mysite.banjjak.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysite.banjjak.dao.UserDao;
import com.mysite.banjjak.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public void join(User user) {
		userDao.join(user);
		
	}

	@Override
	public User getUserByUsername(String username) {
		return null;
	}

	@Override
	public Map<String, Object> userInfo(String userId) {
		return userDao.userinfo(userId);
	}

	@Override
	public void updateUserInfo(Map<String, Object> userInfo) {
		userDao.updateUserInfo(userInfo);
	}

	
}
