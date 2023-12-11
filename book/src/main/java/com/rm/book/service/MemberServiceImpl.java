package com.rm.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rm.book.mapper.MemberMapper;
import com.rm.book.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;

	@Override
	public int insertMember(MemberVO memberVO) {
		return memberMapper.insertMember(memberVO);
	}

	@Override
	public MemberVO getMember(MemberVO memberVO) {
		return memberMapper.getMember(memberVO);
	}

	
}
