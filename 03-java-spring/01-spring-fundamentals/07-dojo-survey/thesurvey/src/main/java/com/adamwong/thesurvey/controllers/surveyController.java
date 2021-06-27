package com.adamwong.thesurvey.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class surveyController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/code")
	public String surveyFunc() {
		return "survey.jsp";
	}
}
