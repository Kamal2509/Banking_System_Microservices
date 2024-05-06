package com.BankSystem.accounts.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class accountController {

	@GetMapping("/")
	public String checkmethod() {
		return "hello world";
	}
	
}
