package com.yoon.mbtiCommunity.Service;

import com.yoon.mbtiCommunity.DTO.MemberDTO;

public interface MemberService {

	boolean register(String id, String password, String mbtiOption);

    MemberDTO login(String loginId, String loginPassword);



}