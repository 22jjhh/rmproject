package com.rm.book.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.rm.book.vo.BooksVO;

@Mapper
public interface BooksMapper {

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
