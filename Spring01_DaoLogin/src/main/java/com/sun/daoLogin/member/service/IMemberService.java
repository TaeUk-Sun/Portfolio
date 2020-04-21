package com.sun.daoLogin.member.service;

import com.sun.daoLogin.member.Member;

public interface IMemberService {
	void memberRegister(Member member);
	Member memberSearch(Member member);
	Member memberModify(Member member);
	int memberRemove(Member member);
}