package com.adamwong.dojoandninja.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adamwong.dojoandninja.models.Dojo;
import com.adamwong.dojoandninja.models.Ninja;
import com.adamwong.dojoandninja.services.DojoandninjaService;

@Controller
public class DojoandninjaController {
	 private final DojoandninjaService dojoandninjaService;
	 public DojoandninjaController(DojoandninjaService service) {
		 this.dojoandninjaService = service;
	 }
	 @RequestMapping("/")
	 public String showAll(Model model) {
		 model.addAttribute("dojos", dojoandninjaService.allDojos());
		 return "ShowAllDojos.jsp";
	 }
	 @RequestMapping("/dojos/new")
	 public String addNewDojo(@ModelAttribute("dojo") Dojo dojo) {
		 return "NewDojo.jsp";
	 }
	 
	 @PostMapping("/dojos/new")
	 public String Create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		 if(result.hasErrors()) {
			 return "/NewDojo.jsp";
		 }
		 this.dojoandninjaService.createDojo(dojo);
		 return"redirect:/";
	 }
	 
	 @RequestMapping("/ninjas/new")
	 public String addNewNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		 model.addAttribute("dojos", this.dojoandninjaService.allDojos());
		 return "NewNinja.jsp";
	 }
	 
	 @PostMapping("/ninjas/new")
	 public String Create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		 if(result.hasErrors()) {
			 model.addAttribute("dojos", this.dojoandninjaService.allDojos());
			 return "/NewNinja.jsp";
		 }
		 this.dojoandninjaService.createNinja(ninja);
		 return"redirect:/";
	 }
	 @RequestMapping("/dojos/{id}")
	 public String show(@PathVariable("id") Long id, Model model) {
		 model.addAttribute("dojo", this.dojoandninjaService.findDojo(id));
		 System.out.println(dojoandninjaService.findDojo(id));
		 return "ShowDojo.jsp";
	 }
	 @RequestMapping("/dojos/delete/{id}")
	 public String destroyDojo(@PathVariable("id") Long id) {
		 dojoandninjaService.destroyDojo(id);
	     return "redirect:/";
	 }
	 @RequestMapping("/ninjas/delete/{id}")
	 public String destroyNinja(@PathVariable("id") Long id) {
		 dojoandninjaService.destroyNinja(id);
	     return "redirect:/";
	 }
}