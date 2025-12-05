package com.example.Spring_boot_95_AllConcept.UsingjpaCrudWithPostman;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books/")
public class BookController {

	
	@Autowired
	private BookService service;
	
	@GetMapping
	public List<Book> listofBook()
	{
		List<Book> bookList=service.listBook();
		System.out.println(bookList);
		return bookList;
	}
	
	@PostMapping
	public String saveBook(@RequestBody Book book)
	{
		service.saveBook(book);
		return "Book saved Successfully";
	}
	
	@DeleteMapping("/{bid}")
	public String deleteBook(@PathVariable int bid)
	{
		service.deleteBook(bid);
		return "book deleted successfully";
	}
	
	@PutMapping("/{bid}")
	public String updateBooks(@PathVariable int bid,@RequestBody Book book)
	{
		Book updatedBook=service.updateBook(bid);
		System.out.println(updatedBook);
		if(updatedBook!=null)
		{
			updatedBook.setBname(updatedBook.getBname());
			updatedBook.setBauthor(book.getBauthor());
			updatedBook.setPrice(book.getPrice());
			service.saveBook(updatedBook);
			return "book updated Successfully";
		}
		return "book id not found";
	}
}
