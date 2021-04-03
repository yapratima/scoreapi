package com.scoreapi.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scoreapi.spring.model.score;
@Repository
public class ScoreDaoImplementation implements Scoredao{
     @Autowired
	private SessionFactory sessionFactory;
	@Override
	public long save(score sc) {
		sessionFactory.getCurrentSession().save(sc);
		return sc.getId();
	}

	@Override
	public score get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<score> list() {
	
		
		List<score> list=sessionFactory.getCurrentSession().createQuery("from CurrentMatches").list();
		                  
				return list;
	}

	@Override
	public void update(long id, score sc) {
		// TODO Auto-generated method stub
		
	}

}
