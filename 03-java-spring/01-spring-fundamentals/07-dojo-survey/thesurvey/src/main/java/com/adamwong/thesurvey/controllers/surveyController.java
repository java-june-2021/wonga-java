package com.adamwong.thesurvey.controllers;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class surveyController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/survey")
	public String surveyFunc(HttpSession session) {
		return "result.jsp";
	}
	//This had to be a post, rather than a request mapping
	@PostMapping("/trySurvey")
	public String surveySubmit(@RequestParam("name") String name,
								@RequestParam("location") String location,
								@RequestParam("language") String language,
								@RequestParam("comment") String comment, 
								HttpSession session) {
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		return "redirect:/survey";
	}
}

//
//
//package com.adamwong.thecode.controllers;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//@Controller
//public class codeController {
//	@RequestMapping("/")
//	public String index() {
//		return "index.jsp";
//	}
//	@RequestMapping("/code")
//	public String codeFunc() {
//			return "code.jsp";
//		}
//		
//	@RequestMapping("/tryCode")
//    public String codeSubmission(@RequestParam("codesubmit") String codesubmit, HttpSession session, RedirectAttributes redirectAttributes, Model model ) {
//		System.out.println(codesubmit);
//		if (codesubmit.equals("pikachu")) {
//			return "code.jsp";
//		}
//		else {
//			redirectAttributes.addFlashAttribute("tryMessage", "You need to try harder!");
////			model.addAttribute("tryMessage", "You need to try harder!");
//			return "redirect:/";
//		}
//	}
//}
