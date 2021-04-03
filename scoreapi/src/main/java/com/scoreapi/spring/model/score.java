package com.scoreapi.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="CurrentMatches")
public class score {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   
   private String TeamA;
   private String TeamB;
   private Boolean matchstarted;
   private int overs;
   private long score;
public int getOvers() {
	return overs;
}

public void setOvers(int overs) {
	this.overs = overs;
}

public long getScore() {
	return score;
}

public void setScore(long score) {
	this.score = score;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getTeamA() {
	return TeamA;
}

public void setTeamA(String teamA) {
	TeamA = teamA;
}

public String getTeamB() {
	return TeamB;
}

public void setTeamB(String teamB) {
	TeamB = teamB;
}

public Boolean getMatchstarted() {
	return matchstarted;
}

public void setMatchstarted(Boolean matchstarted) {
	this.matchstarted = matchstarted;
}
@Override
public String toString() {
	return "score [id=" + id + ", TeamA=" + TeamA + ", TeamB=" + TeamB + ", matchstarted=" + matchstarted + "]";
}
}

