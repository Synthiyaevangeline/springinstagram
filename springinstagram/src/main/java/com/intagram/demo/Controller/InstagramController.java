package com.intagram.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstagramController {
	@GetMapping("/login")
	public String login()
	{
		return "login sucessful";
	}

}
