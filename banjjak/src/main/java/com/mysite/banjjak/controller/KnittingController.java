package com.mysite.banjjak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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
}


