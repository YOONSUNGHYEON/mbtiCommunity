package com.yoon.mbtiCommunity.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class BoardController {

	@GetMapping("/boards")
	public String index(Model model) {
		model.addAttribute("message", "์ข์ ์์นจ");
		return "index";
	}
}
