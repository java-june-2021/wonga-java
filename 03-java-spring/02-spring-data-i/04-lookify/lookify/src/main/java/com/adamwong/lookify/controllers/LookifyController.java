package com.adamwong.lookify.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adamwong.lookify.models.Lookify;
import com.adamwong.lookify.services.LookifyService;

@Controller
public class LookifyController {
 private final LookifyService lookifyService;
 
 public LookifyController(LookifyService lookifyService) {
	 this.lookifyService = lookifyService;
 }
 
 @RequestMapping("/")
 public String index() {
	 return "welcome.jsp";
 }
 
 @RequestMapping("/dashboard")
 public String dashboard(@ModelAttribute("lookify") Lookify lookify, Model model) {
	 List<Lookify> songs = lookifyService.allSongs();
	 model.addAttribute("all_songs", songs);
	 return"dashboard.jsp";
 }
 
 @RequestMapping(value="/songs/{id}", method = RequestMethod.GET)
 public String findSong(@PathVariable("id") Long id, Model model) {
     Lookify song = lookifyService.findLanguageByIndex(id);
     if (song == null){
    	 return "redirect:/dashboard";
     }
     model.addAttribute("song", song);
     return "showSong.jsp";
 }
 
 @RequestMapping(value="/songs/new", method = RequestMethod.GET)
 public String makeSong(@PathVariable("id") Long id, Model model) {
     Lookify song = lookifyService.findLanguageByIndex(id);
     if (song == null){
    	 return "redirect:/dashboard";
     }
     model.addAttribute("song", song);
     return "showSong.jsp";
 }
 
 @PostMapping("/songs/new")
 public String createSong(@PathVariable("id") Long id, Model model) {
     Lookify song = lookifyService.findLanguageByIndex(id);
     if (song == null){
    	 return "redirect:/dashboard";
     }
     model.addAttribute("song", song);
     return "showSong.jsp";
 }
 
 @RequestMapping(value="/lookify/delete/{id}")
 public String destroySong(@PathVariable("id") Long id) {
     lookifyService.destroySong(id);
     return "redirect:/languages";
 }
 
 @RequestMapping("/search/{artist}")
 public String searchArtist(@PathVariable("artist") String artist, Lookify lookify, Model model) {
	 List<Lookify> songs = lookifyService.allSongs();
	 model.addAttribute("all_songs", songs);
	 return"searchResult.jsp";
 }
 
 @RequestMapping("/search/topTen")
 public String topTen(@ModelAttribute("Lookify") Lookify lookify, Model model) {
	 List<Lookify> songs = lookifyService.allSongs();
	 model.addAttribute("all_songs", songs);
	 return"topTen.jsp";
 }
 
}
