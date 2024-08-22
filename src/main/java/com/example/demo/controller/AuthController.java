package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AuthController {

	@PostMapping("/login")
	public String index() {
		return "company/list";
	}
	
	
}
