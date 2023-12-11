package com.rm.book.service;

import java.util.List;

import com.rm.book.vo.LoanVO;

public interface LoanService {

	// Get list
	List<LoanVO> listLoan();
	// Get one
	LoanVO getLoan(LoanVO loanVO);
	// insert
	int insertLoan(LoanVO loanVO);
	//update
	int updateLoan(LoanVO loanVO);
	// delete
//	int deleteLoan(LoanVO loanVO);
}
