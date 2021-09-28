package com.yoon.mbtiCommunity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yoon.mbtiCommunity.Service.MemberService;
@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

	@GetMapping("/login")
	public String login(Model model) {
		//memberService.login(loginId, loginPassword);
		return "login";
	}

	@GetMapping("/members")
	public String register(Model model) {

		return "register";
	}

}
