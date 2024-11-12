package com.mysite.banjjak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crochet")
public class CrochetController {

	@GetMapping("/list")
	public String list() {
		return "crochet/list";
	}
}
