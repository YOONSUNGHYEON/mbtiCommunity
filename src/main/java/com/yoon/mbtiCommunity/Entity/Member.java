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


@Entity(name = "tMemberList")
@Table(name = "tMemberList")
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberSeq;

    @Column(unique = true)
    @JoinColumn(name = "sID", nullable = false)
    private String memberId;

    @JoinColumn(name = "sPassword", nullable = false)
    private String memberPassword;

    @JoinColumn(name = "dtJoinDate", nullable = false)
    private String memberdJoinDate ;

    @ManyToOne
    @JoinColumn(name = "nMbtiOptionSeq", nullable = false)
    private MbtiOption mbtiOption;


    public Member() { }
}
