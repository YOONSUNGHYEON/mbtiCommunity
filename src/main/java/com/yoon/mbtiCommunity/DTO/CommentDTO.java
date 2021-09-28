package com.yoon.mbtiCommunity.DTO;

import com.yoon.mbtiCommunity.Entity.Board;
import com.yoon.mbtiCommunity.Entity.Member;

import lombok.Data;

@Data
public class CommentDTO {
	private int seq;
	private Board board;
	private Member member;
	private String content;
    private String createDate ;
}
