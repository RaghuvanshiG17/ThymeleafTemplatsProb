package com.raghu.ThymeleafTemplateProb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/home")
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/aboutus")
	public String aboutUp() {
		return "aboutus";
	}
	
}
