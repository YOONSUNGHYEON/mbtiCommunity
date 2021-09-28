package com.yoon.mbtiCommunity.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yoon.mbtiCommunity.DTO.MemberDTO;
import com.yoon.mbtiCommunity.Entity.Member;
import com.yoon.mbtiCommunity.Repository.MbtiOptionRepository;
import com.yoon.mbtiCommunity.Repository.MemberRepository;

@Service
@Transactional
public class MemberServiceImp implements MemberService{
	@Autowired
	MemberRepository memberRepository;
	@Autowired
	MbtiOptionRepository mbtiOptionRepository;


	@Override
	public MemberDTO login(String loginId, String loginPassword) {
		return null;
	}

	@Override
	public boolean register(String id, String password, String mbtiOption) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		//중복 검사
		if(memberRepository.findById(id)) {
			return false;
		}
		Member member = new Member(id, password,format.format(time), mbtiOptionRepository.getById(Integer.parseInt(mbtiOption)));
		memberRepository.save(member);
		return true;
	}

}
