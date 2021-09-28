package com.yoon.mbtiCommunity.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Entity(name="BoardOption")
@Table(name = "tBoardOption")
@Getter
public class BoardOption {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nBoardOptionSeq")
    private int seq;

    @Column(name = "sName", nullable = false)
    private String name;


}
