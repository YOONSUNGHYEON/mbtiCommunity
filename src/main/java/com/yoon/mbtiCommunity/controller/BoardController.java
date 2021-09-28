package com.yoon.mbtiCommunity.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class BoardController {

	@GetMapping("/board")
	public String index(Model model) {
		model.addAttribute("message", "좋은 아침");

		return "index";
	}
}
