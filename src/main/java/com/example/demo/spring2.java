package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class spring2 {
	@GetMapping("/Hello")
	public String Hello() {
		return "Welcome";
	}

}
