package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/olar")
public class OlarController {

	
	@GetMapping
	public String hello() {
		return "Hello, world";
		
	}
	
}
