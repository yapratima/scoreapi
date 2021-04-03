package com.scoreapi.spring.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scoreapi.spring.dao.Scoredao;
import com.scoreapi.spring.model.score;
@Service
public class Scoreserviceimplementation implements Scoreservice {
    @Autowired
	private Scoredao scoreDao;
	@Override
	@Transactional
	public long save(score sc) {
		// TODO Auto-generated method stub
		return scoreDao.save(sc);
	}

	@Override
	public score get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<score> list() {
		// TODO Auto-generated method stub
		            
		return scoreDao.list(); 
	}

	@Override
	public void update(long id, score sc) {
		// TODO Auto-generated method stub
		
	}
	
	
}
