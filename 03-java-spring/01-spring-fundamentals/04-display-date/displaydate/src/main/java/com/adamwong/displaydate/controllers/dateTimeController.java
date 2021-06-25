package com.adamwong.displaydate.controllers;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dateTimeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/time")
	public String timeFunc(Model model) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");
		System.out.println(formatter.format(now));
		model.addAttribute("date", formatter.format(now));
		return "timePage.jsp";
	}
	@RequestMapping("/date")
	public String dateFunc(Model model) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE',' 'the' dd 'of' MMMM',' YYYY");
		System.out.println(formatter.format(now));
		model.addAttribute("date", formatter.format(now));
		return "datePage.jsp";
	}
}
