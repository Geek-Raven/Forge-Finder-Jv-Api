package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.FavDrink;
import com.example.demo.Models.DrinkRepository;

@RestController
@RequestMapping("/favDrink")
@CrossOrigin(origins = "http://localhost:4200")
public class DrinkController {
	
	@Autowired
	DrinkRepository drinkRepository;
	
	@GetMapping
	public List<FavDrink> getDrinks() {
		return drinkRepository.findAll();
	}
	
	@PostMapping
	public void createDrinks(@RequestBody FavDrink favDrink) {
		drinkRepository.save(favDrink);
	}

}
