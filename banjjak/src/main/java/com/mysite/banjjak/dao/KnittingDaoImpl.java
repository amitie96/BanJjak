package com.mysite.banjjak.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysite.banjjak.model.Knitting;

@Repository
public class KnittingDaoImpl implements KnittingDao {
	
	@Autowired
	SqlSession sql;

	@Override
	public void write(Knitting knitting) {
		sql.insert("knitting.write", knitting);
	}
}
