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
import org.springframework.web.multipart.MultipartFile;

import com.mysite.banjjak.model.Crochet;
import com.mysite.banjjak.service.CrochetService;

@Controller
@RequestMapping("/crochet")
public class CrochetController {
	
	@Autowired
	CrochetService crochetService;

	@GetMapping("/list")
	public String list() {
		return "crochet/list";
	}
	
	@GetMapping("/write")
	public String write() {
		return "crochet/write";
	}
	
	@PostMapping("/write")
	public String add(Crochet crochet, HttpSession session, MultipartFile uploadFile, Model model) {
		
		String userId = (String) session.getAttribute("userId");
		/*
		 * if (userId == null) { return "redirect:/login"; // 로그인이 안 되어 있으면 로그인 페이지로
		 * 리다이렉트 }
		 */
	    crochet.setUserId(userId);
		
		crochetService.add(crochet);
		
		
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
		
		return "redirect:/crochet/list";
	}
}
