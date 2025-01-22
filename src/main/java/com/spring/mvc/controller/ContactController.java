package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.model.User;
import com.spring.mvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("form","Registartion Form");
	}
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println(user);	
		this.userService.createuser(user);
		return "success";
	}
	
	/* For Reference we can see how it will work previously
	 
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String userEmail,
			@RequestParam("name") String userName,
			@RequestParam("password") String userPassword, Model model) {
		
		User user =  new User();
		user.setEmail(userEmail);
		user.setName(userName);
		user.setPassword(userPassword);
		
		System.out.println(user);
		
		model.addAttribute("user", user);
		return "success";
	} */
}
