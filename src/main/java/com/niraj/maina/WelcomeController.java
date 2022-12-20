package com.niraj.maina;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	

	@GetMapping("/")
	public String welcomePage() {
		System.out.println("||||||  Maina App ==> Index Page Route => " + new Date());
		return "index";
	}
	

}
