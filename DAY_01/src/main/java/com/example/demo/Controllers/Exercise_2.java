package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise_2 {
	@Value("${name}")
	private String studentName;
	
	@GetMapping("/")
	public String getName() {
		return "Welcome "+studentName+" !";
	}
}
