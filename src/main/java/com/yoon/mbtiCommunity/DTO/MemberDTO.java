package com.yoon.mbtiCommunity.DTO;

import com.yoon.mbtiCommunity.Entity.MbtiOption;

import lombok.Data;

@Data
public class MemberDTO {
	 private int seq;
	 private String id;
	 private String password;
	 private String password2;
	 private String joinDate;
	 private MbtiOption mbtiOption;
}
