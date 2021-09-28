package com.yoon.mbtiCommunity.Service;

import com.yoon.mbtiCommunity.DTO.MemberDTO;

public interface BoardService {

    void register(MemberDTO memberDTO);

    MemberDTO login(String loginId, String loginPassword);


}