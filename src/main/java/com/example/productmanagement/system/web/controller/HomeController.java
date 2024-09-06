package com.example.productmanagement.system.web.controller;

import com.example.productmanagement.system.bl.service.book.BookService;
import com.example.productmanagement.system.persistence.entity.Book;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

	@Autowired
	private BookService bookService;

	@Autowired
	private ObjectMapper objectMapper;
	
	@GetMapping("/")
	public ModelAndView homePage() {
		ModelAndView model=new ModelAndView();
		model.setViewName("home");
		List<Book> bookList = bookService.getAllBooks();
		try {
			String booksJson = objectMapper.writeValueAsString(bookList);
			model.addObject("booksChart", booksJson);
			System.out.println("BooksChart JSON: " + booksJson);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		model.addObject("pageTitle", "Home | BookStore");
		return model;
	}
//	@GetMapping("/booksChart")
//	public String getBookList(Model model) {
//		List<Book> bookList = this.bookService.getAllBooks();
//		model.addAttribute("booksChart", bookList);
//		return "home";
//	}
}
