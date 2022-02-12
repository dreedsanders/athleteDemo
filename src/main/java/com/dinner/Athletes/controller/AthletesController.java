package com.dinner.Athletes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dinner.Athletes.exception.AthleteNotFoundException;
import com.dinner.Athletes.model.Athlete;
import com.dinner.Athletes.service.AthleteService;

@RestController
@RequestMapping(value = "/athletes")
public class AthletesController {
	
	@Autowired
	private AthleteService athleteServ;
	
	@GetMapping(value = "/all")
	public ResponseEntity<List<Athlete>> getAllAthletes(){
		List<Athlete> athleteList = athleteServ.findAllAthletes();
		return new ResponseEntity<>(athleteList, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Athlete> getAthleteById(@PathVariable Integer id) throws AthleteNotFoundException{
		Athlete foundAthlete = athleteServ.findAthleteById(id);
		return new ResponseEntity<>(foundAthlete, HttpStatus.OK);
	}
	
	@PostMapping(value = "/add")
	public Athlete addAthlete(@RequestBody Athlete athlete) {
		return athleteServ.addAthlete(athlete);
	}
	
	@PutMapping(value="/{id}")
	public Athlete updateAthlete(@RequestBody Athlete athlete, @PathVariable Integer id) throws AthleteNotFoundException{
		Athlete foundAthlete = athleteServ.findAthleteById(id);
			foundAthlete.setName(athlete.getName());
			foundAthlete.setSport(athlete.getSport());
			foundAthlete.setSpecialMove(athlete.getSpecialMove());
		return athleteServ.updateAthlete(foundAthlete);	
	}
	
	@DeleteMapping(value= "/{id}")
	public ResponseEntity<String> deleteAthlete(@PathVariable Integer id) throws AthleteNotFoundException {
		String message = "The athlete has been removed from the table.";
		athleteServ.deleteAthleteById(id);
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
}





