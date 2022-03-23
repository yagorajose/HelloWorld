package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping


public class BsmController {

@GetMapping("/bsm")

	public String bsm() {
	
		return "Mentalidades: orientação ao futuro, responsabilidade social, mentalidade de crescimento e persistência" + 
		"\nHabilidades: trabalho em equipe, atenção aos detalhes, proatividade e comunicação";
	
}
	
	
	
}
