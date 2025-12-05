package com.example.Spring_boot_95_AllConcept.UsingjpaCrudWithPostman;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	private BookRepository repo;
	
	//to list of book
	public List<Book> listBook()
	{
		return repo.findAll();
	}
	
	//to save book
	public Book saveBook(Book book)
	{
		return repo.save(book);
	}
	
	//to delete book
	public void deleteBook(int bid)
	{
		 repo.deleteById(bid);
	}
	
	//to update book
	public Book updateBook(int bid)
	{
		return repo.findById(bid).get();
	}
}
