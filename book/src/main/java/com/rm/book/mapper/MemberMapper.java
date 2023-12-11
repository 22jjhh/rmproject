package com.rm.book.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.rm.book.vo.MemberVO;


@Mapper
public interface MemberMapper {

	// Get one
	MemberVO getMember(MemberVO memberVO);
	// insert
	int insertMember(MemberVO memberVO);
}
