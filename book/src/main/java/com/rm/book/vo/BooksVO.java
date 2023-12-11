package com.rm.book.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BooksVO {
	private int bookNo;
	private String bookName;
	private String bookWriter;
	private String bookPub;
	private String bookCg;
	private Date bookPubdate;
	private Date bookRegdate;
	private String bookIntro;
	private String bookImg;
	private String bookLoanyn;
}
