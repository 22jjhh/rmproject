package com.rm.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rm.book.mapper.LoanMapper;
import com.rm.book.vo.LoanVO;

@Service
public class LoanServiceImpl implements LoanService {

	@Autowired
	private LoanMapper loanMapper;

	@Override
	public List<LoanVO> listLoan() {
		return loanMapper.listLoan();
	}

	@Override
	public LoanVO getLoan(LoanVO loanVO) {
		return loanMapper.getLoan(loanVO);
	}

	@Override
	public int insertLoan(LoanVO loanVO) {
		return loanMapper.insertLoan(loanVO);
	}

	@Override
	public int updateLoan(LoanVO loanVO) {
		return loanMapper.updateLoan(loanVO);
	}

}
