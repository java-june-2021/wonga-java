package com.adamwong.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class counterController {

	@RequestMapping("/")
	    public String index(HttpSession session, HttpSession session2){
//	         check if a key exists in session with the name "count"
	        if(session.getAttribute("count") == null) {
	            // no key found!  set session "count" to 0
	            session.setAttribute("count", 0);
	        }
	        if(session2.getAttribute("count2") == null) {
	            // no key found!  set session "count" to 0
	            session2.setAttribute("count2", 0);
	        }
	        Integer currentCount = (Integer) session.getAttribute("count");
	        currentCount++;
	        session.setAttribute("count", currentCount)
//This stuff doesn't work!
//	        Integer doubleCount = (Integer) session2.getAttribute("double_count");
//	        doubleCount++;
//	        doubleCount++;
//	        session2.setAttribute("double_count", doubleCount);
	        return "index.jsp";
	    }
	@RequestMapping("/counter")
	public String counterFunc(HttpSession session) {
        if(session.getAttribute("count") == null) {
            // no key found!  set session "count" to 0
            session.setAttribute("count", 0);
        }
		return "counter.jsp";
	}
	@RequestMapping("/counter2")
	public String counter2Func(HttpSession session, HttpSession session2) {
        if(session.getAttribute("count") == null) {
            // no key found!  set session "count" to 0
            session.setAttribute("count", 0);
        }
        if(session2.getAttribute("count2") == null) {
            // no key found!  set session "count" to 0
            session2.setAttribute("count2", 0);
        }
		return "counter2.jsp";
	}
	@RequestMapping("/reset")
	public String Reset(HttpSession session) {
		session.invalidate();
		return "redirect:/counter";
	}
}