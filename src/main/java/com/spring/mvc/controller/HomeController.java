package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/index")
	public String index(Model model) {		
		return "index";
	}
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name","Ayush");
		System.out.println("This is Home URL");
		List<String> friends = new ArrayList<String>();
		friends.add("Ayush");
		friends.add("Pratiksha");
		friends.add("Arif");
		model.addAttribute("f", friends);
		return "home";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is About URL");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is Help URL");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name","Ayush");
		modelAndView.setViewName("help");
		
		List<String> friends = new ArrayList<String>();
		friends.add("Ayush");
		friends.add("Pratiksha");
		friends.add("Arif");
		
		modelAndView.addObject("f", friends);
		return modelAndView;
	}
}
