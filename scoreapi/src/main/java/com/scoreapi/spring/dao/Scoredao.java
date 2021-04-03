package com.scoreapi.spring.dao;

import java.util.List;

import com.scoreapi.spring.model.score;

public interface Scoredao {
	//save the record
	 long save(score sc);
    //get a single record
	score get(long id);
	//get all records
	List<score> list();
	//update the record
	void update(long id,score sc);
	//delete a record
	
	
}
