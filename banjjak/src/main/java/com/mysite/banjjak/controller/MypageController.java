package com.mysite.banjjak.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.banjjak.model.User;
import com.mysite.banjjak.service.UserService;

@Controller
@RequestMapping("/mypage")
public class MypageController {

    @Autowired
    private UserService userService;  

    @GetMapping("/list")
	public String join(@RequestParam String userId, Model model) {
    	
    	Map<String, Object> userInfo = userService.userInfo(userId);
    	
    	model.addAttribute("userInfo", userInfo);
    	
		return "mypage/list";
	}
    
    @PostMapping("/list")
    public String updateUserInfo(@RequestParam Map<String, Object> userInfo, Model model) {
    	
    	userService.updateUserInfo(userInfo);
    	
    	model.addAttribute("userInfo", userInfo);
    	
    	return "mypage/list";
    }
    
   
}
