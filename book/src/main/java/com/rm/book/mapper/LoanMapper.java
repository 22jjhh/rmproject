package com.rm.book.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rm.book.vo.LoanVO;


@Mapper
public interface LoanMapper {

	// Get list
	List<LoanVO> listLoan();
	// Get one
	LoanVO getLoan(LoanVO loanVO);
	// insert
	int insertLoan(LoanVO loanVO);
	//update
	int updateLoan(LoanVO loanVO);
}
