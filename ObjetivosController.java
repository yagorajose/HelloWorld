package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ObjetivosController {

	@GetMapping("/objetivos")
	
	public String objetivos() {
		
		return "Aprender conceitos sobre o SpringTool e relacioná-lo com o Postman/Insomnia";
		
	}
	
	
	
}
