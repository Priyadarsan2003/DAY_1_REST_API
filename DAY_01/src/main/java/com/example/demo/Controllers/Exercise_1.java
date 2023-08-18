package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise_1 {
	@GetMapping("/welcome")
	public String Welcome() {
		return "Welcome String Boot!";
	}
}
