package com.yoon.mbtiCommunity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yoon.mbtiCommunity.Entity.Comment;
@Repository
public interface CommentRepository extends JpaRepository<Comment,Integer> {

}
