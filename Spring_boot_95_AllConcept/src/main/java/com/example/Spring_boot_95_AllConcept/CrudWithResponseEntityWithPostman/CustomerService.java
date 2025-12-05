package com.example.Spring_boot_95_AllConcept.CrudWithResponseEntityWithPostman;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring_boot_95_AllConcept.UsingjpaCrudWithPostman.Book;
import com.example.Spring_boot_95_AllConcept.UsingjpaCrudWithPostman.BookRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	//to list of book
	public List<Customer> listCustomer()
	{
		return repo.findAll();
	}
	
	//to save book
	public Customer saveCustomer(Customer customer)
	{
		return repo.save(customer);
	}
	
	//to delete book
	public void deleteCustomer(int cid)
	{
		 repo.deleteById(cid);
	}
	
	//to update book
	public Customer updateCustomer(int cid)
	{
		return repo.findById(cid).get();
	}
}
