package com.mysite.banjjak.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String list(Crochet crochet, Model model) {
		List<Crochet> crochetList = crochetService.findAll(crochet);
		model.addAttribute("crochetList", crochetList);
		
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
			String croFilename = uploadFile.getOriginalFilename();
			String croUuid = UUID.randomUUID().toString();
			
			try {
				uploadFile.transferTo(new File("d:/upload/crochet/" + croUuid + "_"  + croFilename));
				
				crochet.setCroFilename(croFilename); 
				crochet.setCroUuid(croUuid);
			} catch (Exception e) {
				return "redirect:/crochet/write";
			}
		}
		
		crochetService.add(crochet);
		
		return "redirect:/crochet/list";
	}
	
	@GetMapping("/detail/{croId}")
	public String detail(@PathVariable int croId, Model model) {
		
		Crochet crochet = crochetService.findById(croId);
		
		if(crochet == null) {
	    	return "redirect:/crochet/list";
	    }
	    
		model.addAttribute("crochet", crochet);
		
		
		return "crochet/detail";
	}
}
