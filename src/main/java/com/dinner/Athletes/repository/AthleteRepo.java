package com.dinner.Athletes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinner.Athletes.model.Athlete;

@Repository
public interface AthleteRepo extends JpaRepository<Athlete, Integer> {

	void deleteAthleteById(Integer id);

	Optional<Athlete> findAthleteById(Integer id); 

}
