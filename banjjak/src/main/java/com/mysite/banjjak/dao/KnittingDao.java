package com.mysite.banjjak.dao;

import java.util.List;

import com.mysite.banjjak.model.Knitting;

public interface KnittingDao {

	void add(Knitting knitting);

	List<Knitting> findAll(Knitting knitting);
	
	

}
