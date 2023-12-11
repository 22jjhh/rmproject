package com.rm.book.service;

import java.util.List;
import com.rm.book.vo.BooksVO;

public interface BooksService {

	// Get list
	List<BooksVO> listBook();
	// Get one
	BooksVO getBook(BooksVO booksVO);
	// insert
	int insertBook(BooksVO booksVO);
	//update
	int updateBook(BooksVO booksVO);
	// delete
	int deleteBook(BooksVO booksVO);
}
