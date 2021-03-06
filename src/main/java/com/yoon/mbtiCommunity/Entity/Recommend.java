package com.yoon.mbtiCommunity.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;

@Entity(name = "Recommend")
@Table(name = "tRecommendList")
@Getter
public class Recommend {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nRecommendSeq", nullable = false)
	private int seq;

	@ManyToOne
	@JoinColumn(name = "nBoardSeq", nullable = false)
	private Board board;

	@ManyToOne
	@JoinColumn(name = "nMemberSeq", nullable = false)
	private Member member;


    @Column(name = "nCheck", nullable = false)
    private int check ;
}
