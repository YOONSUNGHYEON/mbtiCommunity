package com.yoon.mbtiCommunity.Service;

import com.yoon.mbtiCommunity.DTO.MemberDTO;

public interface CommentService {

    void register(MemberDTO memberDTO);

    MemberDTO login(String loginId, String loginPassword);


}