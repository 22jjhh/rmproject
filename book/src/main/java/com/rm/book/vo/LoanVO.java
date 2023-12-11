package com.rm.book.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class LoanVO {
	private int loanNo;
	private int bookNo;
	private String memId;
	private Date loanStdate;
	private Date loanEnddate;
}
