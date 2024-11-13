package com.mysite.banjjak.service;

import com.mysite.banjjak.model.User;

public interface UserService {

	void join(User user);

	User getUserByUsername(String username);

	int updateUser(User user);

}
