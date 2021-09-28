package com.yoon.mbtiCommunity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yoon.mbtiCommunity.Entity.BoardOption;

@Repository
public interface BoardOptionRepository extends JpaRepository<BoardOption,Integer> {

}
