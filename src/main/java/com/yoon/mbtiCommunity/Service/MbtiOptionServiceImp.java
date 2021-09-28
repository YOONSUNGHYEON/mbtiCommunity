package com.yoon.mbtiCommunity.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoon.mbtiCommunity.DTO.MbtiOptionDTO;
import com.yoon.mbtiCommunity.Entity.MbtiOption;
import com.yoon.mbtiCommunity.Repository.MbtiOptionRepository;

@Service
public class MbtiOptionServiceImp implements MbtiOptionService{

	@Autowired
	MbtiOptionRepository mbtiOptionRepository;

	@Override
	public List<MbtiOptionDTO> findAll() {
		List<MbtiOption> mbtiOptionList = mbtiOptionRepository.findAll();
		List<MbtiOptionDTO> mbtiOptionDTOList  = new ArrayList();
		for(int i=0; i<mbtiOptionList.size(); i++) {
			mbtiOptionDTOList.add(new MbtiOptionDTO(mbtiOptionList.get(i)));
		}
		return mbtiOptionDTOList;
	}



}
