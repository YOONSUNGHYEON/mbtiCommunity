package com.yoon.mbtiCommunity.RestAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yoon.mbtiCommunity.DTO.MbtiOptionDTO;
import com.yoon.mbtiCommunity.Service.MbtiOptionService;

@RestController
@RequestMapping("/api")
public class MbtiOptionAPI {
	@Autowired
	MbtiOptionService mbtiOptionService;

	//리뷰 아이디당 좋아요 카운트 가져오기
	@GetMapping("/mbtiOptions")
	public List<MbtiOptionDTO> mbtiOptions(){
		return mbtiOptionService.findAll();
	}
}
