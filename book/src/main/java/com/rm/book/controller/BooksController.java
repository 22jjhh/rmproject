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

import com.rm.book.service.BooksService;
import com.rm.book.vo.BooksVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/bookapi")
public class BooksController {

	@Autowired
	private BooksService booksService;
	
	@GetMapping(value = "/books", produces = "application/json;charset=utf-8")
	public List<BooksVO> listBook() {
		return booksService.listBook();
	}
	
	@GetMapping(value = "/book/{no}", produces = "application/json;charset=utf-8")
	public BooksVO getBook(@PathVariable int no) {
		BooksVO booksVO = new BooksVO();
		booksVO.setBookNo(no);
		return booksService.getBook(booksVO);
	}
	
	@PostMapping(value = "/book", produces = "application/json;charset=utf-8")
	public int insertBook(@RequestBody BooksVO booksVO) {
		log.debug("" + booksVO);
		return booksService.insertBook(booksVO);
	}
	
	@PutMapping(value = "/book", produces = "application/json;charset=utf-8")
	public int updateBook(@RequestBody BooksVO booksVO) {
		return booksService.updateBook(booksVO);
	}
	
	@DeleteMapping(value = "book/{no}", produces = "application/json;charset=utf-8")
	public int deleteBook(@PathVariable int no) {
		BooksVO booksVO = new BooksVO();
		booksVO.setBookNo(no);
		return booksService.deleteBook(booksVO);
	}
}
