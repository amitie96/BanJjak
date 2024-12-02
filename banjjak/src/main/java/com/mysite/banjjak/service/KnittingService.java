package com.mysite.banjjak.service;

import java.util.List;

import com.mysite.banjjak.model.Knitting;

public interface KnittingService {

	void add(Knitting knitting);

	List<Knitting> findAll(Knitting knitting);

	

}
