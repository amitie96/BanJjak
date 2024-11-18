package com.mysite.banjjak.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;


@Controller
@RequestMapping("/knitting")
public class KnittingController {

	@GetMapping("/list")
	public String list() {
		return "knitting/list";
	}
	
	@GetMapping("/write")
	public String write() {
		return "knitting/write";
	}
	
//	하다 말았음 예랑이가 19일에 할 예정	
//	@PostMapping("/write")
//	String upload(Knitting knitting, MultipartFile uploadFile) {
//		if(!uploadFile.isEmpty()) {
//			String filename = uploadFile.getOriginalFilename();
//			
//			try {
//				uploadFile.transferTo(new File("d:/upload/knitting/" + filename));
//				knitting.setFilename(filename);
//			} catch (Exception e) {
//				return "redirect:/knitting/write";
//			}
//		}
//		return "redirect:/knitting/list";	
//	}
	
}


