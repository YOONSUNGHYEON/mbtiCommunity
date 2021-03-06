package com.yoon.mbtiCommunity.DTO;

import com.yoon.mbtiCommunity.Entity.MbtiOption;

import lombok.Data;

@Data
public class MbtiOptionDTO {

	private int seq;
	private String name;

	public MbtiOptionDTO(MbtiOption mbtiOption) {
		// TODO Auto-generated constructor stub
		this.seq = mbtiOption.getSeq();
		this.name = mbtiOption.getName();
	}
}
