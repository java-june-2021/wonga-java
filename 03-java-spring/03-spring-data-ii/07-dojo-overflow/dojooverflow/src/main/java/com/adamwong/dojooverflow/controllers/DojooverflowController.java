package com.adamwong.dojooverflow.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adamwong.dojooverflow.models.Answer;
import com.adamwong.dojooverflow.models.Question;
import com.adamwong.dojooverflow.models.Tag;
import com.adamwong.dojooverflow.services.DojooverflowService;

@Controller
public class DojooverflowController {
    private final DojooverflowService dojooverflowService;
    
    public DojooverflowController(DojooverflowService dojooverflowService) {
    	this.dojooverflowService = dojooverflowService;
    }
    @RequestMapping("/questions")
    public String displayQuestions(@ModelAttribute("question") Question question, Model model, HttpSession session) {
    	if(session.getAttribute("userId") == null) {
    		return"redirect:/login";
    	}
    	model.addAttribute("questions", dojooverflowService.allQuestions());
    	model.addAttribute("tags", dojooverflowService.allTags());
    	System.out.println(dojooverflowService.allQuestions());
    	return "Dashboard.jsp";
    }

    @RequestMapping("/questions/new")
    public String newQuestion(@ModelAttribute("question") Question question) {
    	return "NewQuestion.jsp";
    }
    
    @PostMapping("/questions/new")
    public String postQuestion(@Valid @ModelAttribute("question") Question question, BindingResult result) {
		 if(result.hasErrors()) {
			 return "/NewQuestion.jsp";
		 }
		 this.dojooverflowService.createQuestion(question);
		
		 return"redirect:/questions";
    }
	@RequestMapping("/tags/delete/{id}")
	public String destroyTag(@PathVariable("id") Long id) {
		 dojooverflowService.destroyTag(id);
	     return "redirect:/questions/{id}";
	 }
    @RequestMapping("/questions/{id}")
    public String questionDetail(@PathVariable("id") Long id, @ModelAttribute("answer") Answer answer, Model model) {
    	model.addAttribute("questions", dojooverflowService.findQuestion(id));
    	model.addAttribute("tags", dojooverflowService.allTags());
    	model.addAttribute("answers", dojooverflowService.allAnswers());
        return "NewAnswer.jsp";
    }
	@RequestMapping("/questions/delete/{id}")
	public String destroyQuestion(@PathVariable("id") Long id) {
		 dojooverflowService.destroyQuestion(id);
	     return "redirect:/questions";
	 }
	
	@RequestMapping("/questions/edit/{id}")
	public String viewEditQuestion(@ModelAttribute("question") Question question, @PathVariable("id") Long id, Model model) {
		model.addAttribute("questions", dojooverflowService.findQuestion(id));
	     return "editQuestion.jsp";
	 }
	
	@PostMapping("/questions/edit/{id}")
	public String editQuestion(@Valid @ModelAttribute("question") Question question, @PathVariable("id") Long id, @ModelAttribute("tag") Tag tag) {
		this.dojooverflowService.createQuestion(question);
	     return "redirect:/questions";
	 }
	
    @PostMapping("/answers/new")
    public String postAnswer(@Valid @ModelAttribute("answer") Answer answer, BindingResult result) {
    		this.dojooverflowService.createAnswer(answer);
        return "redirect:/questions/"+answer.getQuestion().getId();
    }
	@RequestMapping("/answers/delete/{id}")
	public String destroyAnswer(@PathVariable("id") Long id) {
		 dojooverflowService.destroyAnswer(id);
	     return "redirect:/answers/new";
	 }
}
