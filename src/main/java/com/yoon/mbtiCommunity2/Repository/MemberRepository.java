package com.yoon.mbtiCommunity2.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MemberRepository extends JpaRepository<Member,Integer> {

    @Override
	List<Member> findAll();

    @Override
	void save(c.Member member);


}
