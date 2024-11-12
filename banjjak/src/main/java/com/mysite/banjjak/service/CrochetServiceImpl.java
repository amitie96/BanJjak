package com.mysite.banjjak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysite.banjjak.dao.CrochetDao;
import com.mysite.banjjak.model.Crochet;

@Service
public class CrochetServiceImpl implements CrochetService {
	
	@Autowired
	CrochetDao crochetDao;

	@Override
	public void write(Crochet crochet) {
		crochetDao.write(crochet);

	}

}
