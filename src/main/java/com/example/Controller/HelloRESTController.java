package com.example.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
	
	@RequestMapping
	public String index() {
		return "Hello from BidgeLabz";
	}

}
