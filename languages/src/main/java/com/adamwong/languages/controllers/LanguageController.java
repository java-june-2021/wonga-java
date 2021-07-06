package com.adamwong.languages.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adamwong.languages.models.Language;
import com.adamwong.languages.services.LanguageService;


//... imports removed for brevity
@Controller
public class LanguageController {
 private final LanguageService languageService;
 
 public LanguageController(LanguageService languageService) {
     this.languageService = languageService;
 }
 
 @RequestMapping("/languages")
 public String index(@ModelAttribute("Language") Language Language, Model model) {
     List<Language> languages = languageService.allLanguages();
     model.addAttribute("all_languages", languages);
     System.out.println(languages);
     return "index.jsp";
 }

 @PostMapping("/languages")
 public String create(@Valid @ModelAttribute("Language") Language Language, BindingResult result) {
     if (result.hasErrors()) {
    	 System.out.println("it had an error");
         return "index.jsp";
     } else {
    	 System.out.println(Language);
         languageService.createLanguage(Language);
         return "redirect:/languages";
     }
 }
 //This needs to show a single language page
 @RequestMapping(value="/languages/{id}", method = RequestMethod.GET)
 public String findLanguage(@PathVariable("id") Long id, Model model) {
     Language language = languageService.findLanguageByIndex(id);
     if (language == null){
    	 return "redirect:/languages";
     }
     model.addAttribute("language", language);
     return "showLanguage.jsp";
     
 }
 
 @RequestMapping("/languages/edit/{id}")
 public String updateLanguage(@PathVariable("id") Long id, Model model) {
     Language language = languageService.findLanguageByIndex(id);
     if (language != null){
         model.addAttribute("language", language);
         return "editLanguage.jsp";
     }else{
         return "redirect:/languages";
     }
 }

 
 @PostMapping("/language/edit/{id}")
 public String updateLanguage(@PathVariable("id") Long id, @Valid @ModelAttribute("Language") Language Language, BindingResult result) {
     if (result.hasErrors()) {
         System.out.println("In the edit statement");
         return "editLanguage.jsp";
     }else{
         System.out.println("In the else statement");
    	 languageService.updateLanguage(id, Language);
         return "redirect:/languages";
     }
 }
 //This one is captured oddly?
 @RequestMapping(value="/languages/delete/{id}")
 public String destroyLanguage(@PathVariable("id") Long id) {
     languageService.destroyLanguage(id);
     return "redirect:/languages";
 }

 
}
