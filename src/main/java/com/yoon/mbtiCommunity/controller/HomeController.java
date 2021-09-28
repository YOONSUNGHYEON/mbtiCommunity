package com.yoon.mbtiCommunity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yoon.mbtiCommunity.Entity.MbtiOption;
import com.yoon.mbtiCommunity.Repository.MbtiOptionRepository;

@Controller
public class HomeController {

    @Autowired
    MbtiOptionRepository mbtiOptionRepository;

	@GetMapping("/")
	public String index(Model model) {
		List<MbtiOption> mbtiOptionList = mbtiOptionRepository.findAll();

		System.out.println(mbtiOptionList.size());
		for(int i=1; i<mbtiOptionList.size(); i++) {
		}
		return "index";
	}
}