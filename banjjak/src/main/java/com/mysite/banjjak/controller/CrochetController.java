package com.mysite.banjjak.controller;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public String writting(Crochet crochet, HttpSession session, MultipartFile uploadFile) {
		
		if(!uploadFile.isEmpty()) {
			String filename = uploadFile.getOriginalFilename();
			
			try {
				uploadFile.transferTo(new File("d:/upload/" + filename));
				
				crochet.setFilename(filename);
			} catch (Exception e) {
				return "redirect:/crochet/write";
			}
		}
		
		return "redirect:/crochet/list";
	}
}
