package com.mysite.banjjak.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysite.banjjak.model.Crochet;

@Repository
public class CrochetDaoImpl implements CrochetDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public void add(Crochet crochet) {
		sql.insert("crochet.add", crochet);

	}

}
