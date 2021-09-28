package com.yoon.mbtiCommunity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yoon.mbtiCommunity.Entity.Member;
import com.yoon.mbtiCommunity.Repository.MemberRepository;

public class BoardController {
    @Autowired
    MemberRepository memberRepository;
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("message", "좋은 아침");
		List<Member> memberList = memberRepository.findAll();
		for(int i=0; i<memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
		return "index";
	}
}
