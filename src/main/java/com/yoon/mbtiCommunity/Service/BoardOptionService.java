package com.yoon.mbtiCommunity.Service;

import java.util.List;

import com.yoon.mbtiCommunity.Entity.BoardOption;

public interface BoardOptionService {

	// 게시판 옵션 리스트 모두 가져오기
	List<BoardOption> findAll();


}