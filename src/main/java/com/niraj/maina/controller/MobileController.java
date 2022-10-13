package com.niraj.maina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MobileController {

	
	@GetMapping("/mobile")
	public String mobileHomePAge() {
		System.out.println("Mobile Home Requested as GET ===> ");
		return "mobileHome";
	}

	
}
