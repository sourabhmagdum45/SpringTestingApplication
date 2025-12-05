package com.example.Spring_boot_95_AllConcept.Crud_JPA_JSP_Pages;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring_boot_95_AllConcept.CrudWithResponseEntityWithPostman.Customer;

@Service
public class productService {

	@Autowired
	private productRepository repo;
	
	////to list of Product
	public List<Product> listProduct()
	{
		return repo.findAll();
	}
	
	//to save Product
	public Product saveProduct(Product product)
	{
		return repo.save(product);
	}
	
	//to delete Product
	public void deleteProduct(int id)
	{
		 repo.deleteById(id);
	}
	
	//to update Product
	public Product updateProduct(int id)
	{
		return repo.findById(id).get();
	}
}
