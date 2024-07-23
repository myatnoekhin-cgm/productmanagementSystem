package com.example.productmanagement.system.web.form;
import com.example.productmanagement.system.persistence.entity.Book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

/**
 * <h2>BookForm Class</h2>
 * <p>
 * Process for Displaying BookForm
 * </p>
 * 
 * @author Myat Noe Khin
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookForm {

    private Long bookId;

    private String title;

	private MultipartFile image;

	private String imageUrl;

	private String author;

	private String genre;

	private double price;

	public BookForm(Book book) {
		this.bookId = book.getBookId();
		this.title = book.getTitle();
		this.author = book.getAuthor();
		this.genre = book.getGenre();
		this.price = book.getPrice();
		this.imageUrl = book.getImageUrl();
	}
}
