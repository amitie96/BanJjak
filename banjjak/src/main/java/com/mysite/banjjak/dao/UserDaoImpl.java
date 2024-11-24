package com.mysite.banjjak.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysite.banjjak.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SqlSession sql;

	@Override
	public void join(User user) {
		sql.insert("user.join", user);
	}
	
	@Override
	public Map<String, Object> userinfo(String userId) {
		 Map<String, Object> userInfo = new HashMap();
		 
		 userInfo = sql.selectOne("user.userinfo", userId);
		 
		return userInfo;
	}

	@Override
	public void updateUserInfo(Map<String, Object> userInfo) {
		
		sql.update("user.updateUserInfo", userInfo);
		
	}

}
