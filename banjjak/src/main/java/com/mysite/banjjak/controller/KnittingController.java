package com.mysite.banjjak.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;

import com.mysite.banjjak.model.Knitting;
import com.mysite.banjjak.model.User;
import com.mysite.banjjak.service.KnittingService;
import com.mysite.banjjak.service.UserService;


@Controller
@RequestMapping("/knitting")
public class KnittingController {
	
	@Autowired
    KnittingService knittingService;
	
	@Autowired
	UserService userService;

	@GetMapping("/list")
	public String list(Knitting knitting ,Model model) {
		List<Knitting> knittingList = knittingService.findAll(knitting);
		model.addAttribute("knittingList", knittingList);
		
		return "knitting/list";
	}
	
	@GetMapping("/write")
	public String write(@SessionAttribute("userInfo") User user, Model model) {
		return "knitting/write";
	}
	

	@PostMapping("/write")
	public String add(@SessionAttribute("userInfo") User user, Knitting knitting, MultipartFile uploadFile) {
		
		knitting.setUserId(user.getUserId());
		
		if(!uploadFile.isEmpty()) {
			String knitFilename = uploadFile.getOriginalFilename();
			String knitUuid = UUID.randomUUID().toString();
			
			try {
				uploadFile.transferTo(new File("D:/upload/knitting/" + knitUuid + "_" + knitFilename));
				knitting.setKnitFilename(knitFilename);
				knitting.setKnitUuid(knitUuid);
				
			} catch (Exception e) {
				return "redirect:/knitting/write";
			}
		}
		
		knittingService.add(knitting);
		
		return "redirect:/knitting/list";	
	}
	
}


