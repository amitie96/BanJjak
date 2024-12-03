package com.mysite.banjjak.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysite.banjjak.model.Crochet;
import com.mysite.banjjak.model.Knitting;
import com.mysite.banjjak.model.User;

@Repository
public class CrochetDaoImpl implements CrochetDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public void add(Crochet crochet) {
		sql.insert("crochet.add", crochet);

	}
	
	@Override
	public List<Crochet> findAll(Crochet crochet) {
		return sql.selectList("crochet.list", crochet);
	}

	@Override
	public List<Crochet> myCroList(User user) {
		return sql.selectList("crochet.myCroList", user);
	}

	@Override
	public Crochet findById(int croId) {
		List<Crochet> crochetList = sql.selectList("crochet.detail", croId);
		if(crochetList != null && !crochetList.isEmpty()) {
			return crochetList.get(0);
		}
		return null;
	}


}
