package com.mysite.banjjak.controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;

import com.mysite.banjjak.model.Crochet;
import com.mysite.banjjak.model.User;
import com.mysite.banjjak.service.CrochetService;
import com.mysite.banjjak.service.UserService;

@Controller
@RequestMapping("/crochet")
public class CrochetController {
	
	@Autowired
	CrochetService crochetService;
	
	@Autowired
	UserService userService;

	@GetMapping("/list")
	public String list() {
		
		return "crochet/list";
	}
	
	@GetMapping("/write")
	public String write(@SessionAttribute("userInfo") User user, Model model) {    	
		return "crochet/write";
	}
	
	@PostMapping("/write")
	public String add(@SessionAttribute("userInfo") User user, Crochet crochet, MultipartFile uploadFile) {
		
		crochet.setUserId(user.getUserId());
		
		if(!uploadFile.isEmpty()) {
			String filename = uploadFile.getOriginalFilename();
			String uuid = UUID.randomUUID().toString();
			
			try {
				uploadFile.transferTo(new File("d:/crochet/" + uuid + "_"  + filename));
				
				crochet.setFilename(filename); 
				crochet.setUuid(uuid);
			} catch (Exception e) {
				return "redirect:/crochet/write";
			}
		}
		
		crochetService.add(crochet);
		
		return "redirect:/crochet/list";
	}
}
