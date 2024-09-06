package com.example.productmanagement.system.bl.service.book;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.productmanagement.system.persistence.entity.Book;
import com.example.productmanagement.system.web.form.BookForm;

public interface BookService {
	public List<Book> getAllBooks();

	public Book addBook(BookForm bookForm);
	
	public Page<Book> getBooks(Pageable pageable);
	
	public Book getBookById(Long id);
	
	void deleteBookById(Long bookId);
	
	Book updateBook(BookForm bookForm);
	
	public Page<Book> searchBook(String title, String genre, int page, int size);

	public Page<Book> findByGenre(String genre, Pageable pageable);

	public List<String> findAllGenres();
	
}
