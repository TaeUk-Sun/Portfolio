package com.sun.daoLogin.member.dao;

import com.sun.daoLogin.member.Member;

public interface IMemberDao {
	int memberInsert(Member member);
	Member memberSelect(Member member);
	int memberUpdate(Member member);
	int memberDelete(Member member);
}