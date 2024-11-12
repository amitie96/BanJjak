package com.mysite.banjjak.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.mysite.banjjak.model.User;

@Controller
public class RootController {
	
	@GetMapping("/")
	String index() {
		return "main";
	}
	
	
	@GetMapping("/hello")
	String index(@SessionAttribute User user) {
		return "main";
	}
	
	@GetMapping("/login")
	public String login() {
		return "user/login";
	}

	@PostMapping("/login")
	public String login(User user, HttpSession session) {
		
		if(user.getUserId().equals("a001") && user.getPassword().equals("1234")) {
			user.setUsername("이우정");
			
			session.setAttribute("user", user);
			return "redirect:/";
		} else {
			
			return "redirect:/login?error=true";
		}
		
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
