package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise_3 {
	@Value("${val}")
	private String yourFavColor;
	
	@GetMapping("/color")
	public String getMyFav() {
		return "My favorite color is "+yourFavColor;
	}
}
