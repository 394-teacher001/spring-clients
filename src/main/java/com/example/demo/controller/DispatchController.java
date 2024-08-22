package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Spring bootアプリケーション起動用コントローラ
 */
@Controller
public class DispatchController {
	
	@GetMapping("/login")
	public String login() {
		return "auth/login";
	}
	
	@GetMapping("/")
	public String dispatch() {
		return "dispatcher";
	}
	
}
