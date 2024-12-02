package com.mysite.banjjak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.mysite.banjjak.model.Crochet;
import com.mysite.banjjak.model.Knitting;
import com.mysite.banjjak.model.User;
import com.mysite.banjjak.service.UserService;

@Controller
@RequestMapping("/mypage")
public class MypageController {

    @Autowired
    private UserService userService;  

	
	 @GetMapping("/list") 
	 public String join(@SessionAttribute("userInfo") User user, Knitting knitting, Crochet crochet) {
	 
		 return "mypage/list"; 
	 }
	 
		
		 @PostMapping("/list") 
		 public String updateUserInfo(User userInfo, Model model) {
		 
			 userService.updateUserInfo(userInfo);
			 
			 model.addAttribute("userInfo", userInfo);
			 
			 return "mypage/list"; 
		 }
		 
	 
    
   
}
