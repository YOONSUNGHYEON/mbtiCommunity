package com.yoon.mbtiCommunity.Service;

import java.util.List;

import com.yoon.mbtiCommunity.DTO.MbtiOptionDTO;

public interface MbtiOptionService {

	// Mbti 옵션 리스트 모두 가져오기
	List<MbtiOptionDTO> findAll();


}