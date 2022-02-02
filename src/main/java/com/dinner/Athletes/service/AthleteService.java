package com.dinner.Athletes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinner.Athletes.exception.AthleteNotFoundException;
import com.dinner.Athletes.model.Athlete;
import com.dinner.Athletes.repository.AthleteRepo;

@Service
public class AthleteService {
	
	@Autowired
	private AthleteRepo athleteRepo ;
	
	public Athlete addAthlete(Athlete athlete) {
		return athleteRepo.save(athlete);
	}
	
	public List<Athlete> findAllAthletes(){
		return athleteRepo.findAll();
	}
	
	public Athlete updateAthlete(Athlete athlete) {
		return athleteRepo.save(athlete);
	}
	
	public void deleteAthleteById(Integer id) {
		athleteRepo.deleteAthleteById(id);
	}
	
	public Athlete findAthleteById(Integer id) {
		return athleteRepo.findAthleteById(id).orElseThrow(() -> new AthleteNotFoundException("athlete with id " + id + " not found"));
	}
}
