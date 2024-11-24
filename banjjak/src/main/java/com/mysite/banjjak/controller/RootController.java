package com.mysite.banjjak.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.mysite.banjjak.model.User;
import com.mysite.banjjak.service.UserService;

@Controller
public class RootController {
	
	@Autowired
	private UserService userService;
	
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
	public String login(@RequestParam Map<String, Object> login, User user, HttpSession session) {
		
		if(user.getUserId().equals(login.get("userId")) && user.getPassword().equals(login.get("password"))) {
			Map<String, Object> userInfo = userService.userInfo(String.valueOf(login.get("userId")));
			
			session.setAttribute("userInfo", userInfo);
			return "redirect:/";
		}else {
			return "redirect:/login?error=true";
		}
		
		/*
		 * if(user.getUserId().equals("a001") && user.getPassword().equals("1234")) {
		 * user.setUsername("이우정");
		 * 
		 * session.setAttribute("user", user); return "redirect:/"; } else {
		 * 
		 * return "redirect:/login?error=true"; }
		 */
		
	}
	

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
