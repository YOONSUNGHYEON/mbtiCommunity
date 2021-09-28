package com.yoon.mbtiCommunity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yoon.mbtiCommunity.Entity.MbtiOption;

@Repository
public interface MbtiOptionRepository extends JpaRepository<MbtiOption,Integer>{

}
