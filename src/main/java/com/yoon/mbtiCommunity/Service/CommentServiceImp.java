package com.yoon.mbtiCommunity.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yoon.mbtiCommunity.DTO.MemberDTO;

@Service
@Transactional
public class CommentServiceImp implements CommentService{

	@Override
	public void register(MemberDTO memberDTO) {
		// TODO Auto-generated method stub

	}

	@Override
	public MemberDTO login(String loginId, String loginPassword) {
		// TODO Auto-generated method stub
		return null;
	}

}
