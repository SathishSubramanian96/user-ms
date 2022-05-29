package com.simplilearn.controller;

import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

	@GetMapping("/status/check")
	public String status() {
		return "user-ms is working";
	}
}
