package com.rm.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rm.book.mapper.BooksMapper;
import com.rm.book.vo.BooksVO;

@Service
public class BooksServiceImpl implements BooksService {

	@Autowired
	private BooksMapper booksMapper;

	@Override
	public List<BooksVO> listBook() {
		return booksMapper.listBook();
	}

	@Override
	public BooksVO getBook(BooksVO booksVO) {
		return booksMapper.getBook(booksVO);
	}

	@Override
	public int insertBook(BooksVO booksVO) {
		return booksMapper.insertBook(booksVO);
	}

	@Override
	public int updateBook(BooksVO booksVO) {
		return booksMapper.updateBook(booksVO);
	}

	@Override
	public int deleteBook(BooksVO booksVO) {
		return booksMapper.deleteBook(booksVO);
	}
	


	
}
