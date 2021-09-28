package com.yoon.mbtiCommunity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yoon.mbtiCommunity.Entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board,Integer>{

}
