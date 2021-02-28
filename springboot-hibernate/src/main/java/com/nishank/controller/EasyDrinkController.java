package com.nishank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nishank.model.EasyDrinksModel;
import com.nishank.model.GreetingModel;
import com.nishank.service.EasyDrinksDBService;

@RestController
@RequestMapping(path = "/" , produces = MediaType.APPLICATION_JSON_VALUE)
public class EasyDrinkController {

	@Autowired
	private EasyDrinksDBService easyDrinksService;
	
	@GetMapping(path = "/getAllDrinks")
	public List<EasyDrinksModel> getAllDrinks(){
		return easyDrinksService.getAllDrinks();
	}
	@GetMapping(path = "/greetings")
	public GreetingModel helloGreetings() {
		GreetingModel greeting = new GreetingModel();
		greeting.setMessage("Greetings");
		return greeting;
	}
	@PostMapping(path="/saveDrinks")
	public void saveDrink(@RequestBody EasyDrinksModel easyDrinks) {
		easyDrinksService.saveDrinks(easyDrinks);		
	}
}
