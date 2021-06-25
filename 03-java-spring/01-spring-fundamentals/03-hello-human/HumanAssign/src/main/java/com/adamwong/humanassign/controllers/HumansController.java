package com.adamwong.humanassign.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HumansController {
	String your_name;
	@RequestMapping("/your_server/")
	public String index(Model model) {
		your_name="Human";
		model.addAttribute("tester", your_name);
		return "Humans.jsp";
	}
	@RequestMapping("/your_server/{your_name}")
	public String customGreeting(@PathVariable("your_name") String the_name, Model model) {		
		your_name=the_name;
		model.addAttribute("tester", your_name);
		model.addAttribute("link", "Go back");
		return "Humans.jsp";
	}
}

//	@RequestMapping("/")
//	@GetMapping("/")
//	@PostMapping("/")
//	@RequestMapping("/your_server/")
//	public String personalGreeting(@PathVariable(value="your_name", required=false, defaultValue="Human") String your_name) {
//		model.addAttribute("your_name",your_name);
//		return "Humans.jsp";
//	}
