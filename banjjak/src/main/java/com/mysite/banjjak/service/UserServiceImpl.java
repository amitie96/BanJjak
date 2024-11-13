package com.mysite.banjjak.service;

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
	public int updateUser(User user) {
		return 0;
	}

	
}
