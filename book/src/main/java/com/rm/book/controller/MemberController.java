package com.rm.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rm.book.service.MemberService;
import com.rm.book.vo.MemberVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/memberapi")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
//	@GetMapping(value = "/member", produces = "application/json;charset=utf-8")
//	public List<MemberVO> listMember() {
//		return memberService.listMember();
//	}
	
	@GetMapping(value = "/member/{memId}", produces = "application/json;charset=utf-8")
	public MemberVO getMember(@PathVariable String memId) {
		MemberVO memberVO = new MemberVO();
		memberVO.setMemId(memId);
		return memberService.getMember(memberVO);
	}
	
	@PostMapping(value = "/member", produces = "application/json;charset=utf-8")
	public int insertMember(@RequestBody MemberVO memberVO) {
		log.debug("" + memberVO);
		return memberService.insertMember(memberVO);
	}
	
//	@PutMapping(value = "/member", produces = "application/json;charset=utf-8")
//	public int updateMember(@RequestBody MemberVO memberVO) {
//		return memberService.updateMember(memberVO);
//	}
	
//	@DeleteMapping(value = "member/{memId}", produces = "application/json;charset=utf-8")
//	public int deleteMember(@PathVariable String memId) {
//		MemberVO memberVO = new MemberVO();
//		memberVO.setMemId(memId);
//		return memberService.deleteMember(memberVO);
//	}
}
