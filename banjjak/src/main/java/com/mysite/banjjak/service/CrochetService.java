package com.mysite.banjjak.service;

import java.util.List;
import java.util.Map;

import com.mysite.banjjak.model.Crochet;
import com.mysite.banjjak.model.User;

public interface CrochetService {

	void add(Crochet crochet);

	List<Crochet> findAll(Crochet crochet);

	List<Crochet> myCroList(User user);

}
