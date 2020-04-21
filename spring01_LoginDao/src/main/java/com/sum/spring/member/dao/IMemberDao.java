package com.sum.spring.member.dao;

import com.sum.spring.member.Member;

public interface IMemberDao {

	int memberInsert(Member member);
	Member memberSelect(Member member);
	int memberUpdate(Member member);
	int memberDelete(Member member);
}
