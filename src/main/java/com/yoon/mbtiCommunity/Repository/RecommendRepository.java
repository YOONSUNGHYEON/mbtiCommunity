package com.yoon.mbtiCommunity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yoon.mbtiCommunity.Entity.Recommend;

@Repository
public interface RecommendRepository extends JpaRepository<Recommend,Integer>{

}
