package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Dwarf;
import com.example.demo.Models.OccupationRepository;
import com.example.demo.Models.Occupations;

@RestController
@RequestMapping("/jobs")
@CrossOrigin(origins = "http://localhost:4200")
public class OccupationController {

	@Autowired
	OccupationRepository occupationRepository;
	
	@GetMapping
	public List<Occupations> getJobs() {
		return occupationRepository.findAll();
	}
	@PostMapping
	public void createJob(@RequestBody Occupations occupation) {
		occupationRepository.save(occupation);
	}
}
