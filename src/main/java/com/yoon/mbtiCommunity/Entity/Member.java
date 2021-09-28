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


@Entity(name = "Member")
@Table(name = "tMemberList")
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nMemberSeq", nullable = false)
    private int seq;

    @Column(name = "sID", nullable = false, unique = true)
    private String id;

    @Column(name = "sPassword", nullable = false)
    private String password;

    @Column(name = "dtJoinDate", nullable = false)
    private String joinDate ;

    @ManyToOne
    @JoinColumn(name = "nMbtiOptionSeq", nullable = false)
    private MbtiOption mbtiOption;


    public Member() { }
}
