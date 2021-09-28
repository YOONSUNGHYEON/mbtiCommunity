package com.yoon.mbtiCommunity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yoon.mbtiCommunity.Entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member,Integer> {

	boolean findById(String id);

}
