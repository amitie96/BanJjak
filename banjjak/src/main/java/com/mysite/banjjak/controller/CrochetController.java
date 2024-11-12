package com.mysite.banjjak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String writting(Crochet crochet) {
		crochetService.write(crochet);
		return "redirect:/list";
	}
}
