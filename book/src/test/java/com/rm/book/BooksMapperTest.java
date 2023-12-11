package com.rm.book;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rm.book.mapper.BooksMapper;
import com.rm.book.vo.BooksVO;

@SpringBootTest
public class BooksMapperTest {
	
	@Autowired
	private BooksMapper booksMapper;
	
	@Test
	@DisplayName("북맵테스트")
	public void insertTest() {
		BooksVO booksVO = new BooksVO();
		booksVO.setBookName("책");
		booksVO.setBookWriter("지은이");
		booksVO.setBookPub("출판사");
		booksVO.setBookCg("에세이");
		booksVO.setBookIntro("책입니다!");
		booksVO.setBookImg("book.jpg");
		booksVO.setBookLoanyn("Y");
		
		assertEquals(1, booksMapper.insertBook(booksVO));
	}
}
