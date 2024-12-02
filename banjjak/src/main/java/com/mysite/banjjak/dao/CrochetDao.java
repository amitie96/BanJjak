package com.mysite.banjjak.dao;

import java.util.List;
import java.util.Map;

import com.mysite.banjjak.model.Crochet;

public interface CrochetDao {

	void add(Crochet crochet);

	List<Crochet> findAll(Crochet crochet);

}
