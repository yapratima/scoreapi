package com.scoreapi.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.scoreapi.spring.model.score;
import com.scoreapi.spring.service.Scoreservice;


@RestController
public class ScoreController {
	@Autowired
	private Scoreservice scoreService;
	
	//get allthe score
	@GetMapping("/api/matchlist")
	public ResponseEntity<List<score>> list(){
		List<score> list=scoreService.list();
		return ResponseEntity.ok().body(list);
		
	}
//save the book
	@PostMapping("/api/match")
	public ResponseEntity<?> save(@RequestBody score sc)
	{
		long id=scoreService.save(sc);
		return ResponseEntity.ok().body(id);
		
	}
	
	
	
	
	
	
	
}
