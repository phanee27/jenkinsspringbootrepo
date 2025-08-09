package com.klef;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@GetMapping("/")
	public String home(){
		return "<h3>CI/CD and Cloud DevOps<h3>";
	}
	
	@GetMapping("/demo")
	public String demo() {
		return "<h3>Jenkins Demo<h3>";
	}
	
	@GetMapping("/test")
	public String test() {
		return "<h3>Deploy Spring Boot Using Jenkins<h3>";
	}
	
	
	
}
