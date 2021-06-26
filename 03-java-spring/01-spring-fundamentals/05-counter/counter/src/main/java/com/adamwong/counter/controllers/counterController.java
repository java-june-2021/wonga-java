package com.adamwong.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class counterController {

	@RequestMapping("/")
	    public String index(HttpSession session){
	        // check if a key exists in session with the name "count"
	        if(session.getAttribute("count") == null) {
	            // no key found!  set session "count" to 0
	            session.setAttribute("count", 0);
	        }
	        return "index.jsp";
	    }
	@RequestMapping("/counter")
	public String counterFunc() {
		return "counter.jsp";
	}
	@RequestMapping("/counter2")
	public String counter2Func() {
		return "counter2.jsp";
	}
}
//	
//	LocalDateTime now = LocalDateTime.now();
//	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE',' 'the' dd 'of' MMMM',' YYYY");
//	System.out.println(formatter.format(now));
//	model.addAttribute("date", formatter.format(now));