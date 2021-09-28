package com.yoon.mbtiCommunity.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoon.mbtiCommunity.Entity.BoardOption;
import com.yoon.mbtiCommunity.Repository.BoardOptionRepository;

@Service
public class BoardOptionServiceImp implements BoardOptionService{

	@Autowired
	BoardOptionRepository boardOptionRepository;

	@Override
	public List<BoardOption> findAll() {
		// TODO Auto-generated method stub
		List<BoardOption> boardOptionList = boardOptionRepository.findAll();
		return null;
	}



}
