package com.dinner.Athletes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Athlete {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String sport;
	private String specialMove;
	
	public Athlete() {
		
	}
	
	public Athlete(String name, String sport, String specialMove) {
		super();
		this.name = name;
		this.sport = sport;
		this.specialMove = specialMove;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getSpecialMove() {
		return specialMove;
	}
	public void setSpecialMove(String specialMove) {
		this.specialMove = specialMove;
	}
	@Override
	public String toString() {
		return "Athlete [id=" + id + ", name=" + name + ", sport=" + sport + ", specialMove=" + specialMove + "]";
	}

	public void map(Object object) {
		// TODO Auto-generated method stub
		
	}
	
	
}
