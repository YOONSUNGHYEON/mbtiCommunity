package com.yoon.mbtiCommunity.DTO;

import com.yoon.mbtiCommunity.Entity.Board;
import com.yoon.mbtiCommunity.Entity.Member;

import lombok.Data;

@Data
public class RecommendDTO {
	private int seq;

	private Board board;

	private Member member;

	private int check;

	public RecommendDTO() {

	}

}
