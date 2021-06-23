package com.example.routingsimple.web.controllers;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DojoController {
    @RequestMapping("/dojo")
    public String random() {
            return "Hello Coding Dojo";
    }
    
    @RequestMapping("/dojo/{location}")
    public String showLocation(@PathVariable("location") String location) {
    	if ((location).equals("burbank")) {
    		return "Burbank Dojo is located in Southern California";
    	} else if ((location).equals("san-jose")) {
    		return "SJ dojo is the headquarters";
    	} else {
    		return "I don't know where you are";
    	}
    }
}
