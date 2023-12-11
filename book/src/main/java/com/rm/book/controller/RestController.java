package com.rm.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RestController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("insa", "Hello JSP");
		return "home";
	}
}
