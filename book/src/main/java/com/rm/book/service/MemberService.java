package com.rm.book.service;

import java.util.List;
import com.rm.book.vo.MemberVO;

public interface MemberService {

	// Get list
//	List<MemberVO> listMember();
	// Get one
	MemberVO getMember(MemberVO memberVO);
	// insert
	int insertMember(MemberVO memberVO);
	//update
//	int updateMember(MemberVO memberVO);
	// delete
//	int deleteMember(MemberVO memberVO);
}
