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

import com.rm.book.service.LoanService;
import com.rm.book.vo.LoanVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/Loanapi")
public class LoanController {

	@Autowired
	private LoanService loanService;
	
	@GetMapping(value = "/loan", produces = "application/json;charset=utf-8")
	public List<LoanVO> listLoan() {
		return loanService.listLoan();
	}
	
	@GetMapping(value = "/loan/{no}", produces = "application/json;charset=utf-8")
	public LoanVO getLoan(@PathVariable int no) {
		LoanVO loanVO = new LoanVO();
		loanVO.setLoanNo(no);
		return loanService.getLoan(loanVO);
	}
	
	@PostMapping(value = "/loan", produces = "application/json;charset=utf-8")
	public int insertLoan(@RequestBody LoanVO loanVO) {
		log.debug("" + loanVO);
		return loanService.insertLoan(loanVO);
	}
	
	@PutMapping(value = "/loan", produces = "application/json;charset=utf-8")
	public int updateLoan(@RequestBody LoanVO loanVO) {
		return loanService.updateLoan(loanVO);
	}
	
//	@DeleteMapping(value = "loan/{no}", produces = "application/json;charset=utf-8")
//	public int deleteLoan(@PathVariable int no) {
//		LoanVO loanVO = new LoanVO();
//		loanVO.setLoanNo(no);
//		return loanService.deleteLoan(loanVO);
//	}
}
