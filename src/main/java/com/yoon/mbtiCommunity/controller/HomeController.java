package com.yoon.mbtiCommunity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yoon.mbtiCommunity.Repository.MbtiOptionRepository;

@Controller
public class HomeController {

    @Autowired
    MbtiOptionRepository mbtiOptionRepository;

	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}
}