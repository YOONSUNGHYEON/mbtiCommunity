package com.yoon.mbtiCommunity.DTO;

import com.yoon.mbtiCommunity.Entity.BoardOption;
import com.yoon.mbtiCommunity.Entity.Member;

import lombok.Data;

@Data
public class BoardDTO {
	private int seq;
	private BoardOption boardOption;
	private Member member;
	private String title;
	private String content;
    private String createDate ;
    private int hit ;
}
