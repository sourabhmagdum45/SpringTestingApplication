package com.example.Spring_boot_95_AllConcept.CrudWithResponseEntityWithPostman;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers/")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@GetMapping
	public ResponseEntity<List<Customer>> getList()
	{
		List<Customer> customerList=service.listCustomer();
		return  ResponseEntity.ok(customerList);
	}
	
	@PostMapping
	public ResponseEntity<Customer> saveCustomers(@RequestBody Customer customer)
	{
		Customer customer1=service.saveCustomer(customer);
		return ResponseEntity.status(HttpStatus.CREATED).body(customer1);
	}
	
	@DeleteMapping("/{cid}")
	public ResponseEntity<String> deletecustomer(@PathVariable int cid)
	{
		service.deleteCustomer(cid);
		return ResponseEntity.ok("customer deleted successfully");
	}
	
	@PutMapping("/{cid}")
	public ResponseEntity<String> updatecustomer(@PathVariable int cid,@RequestBody Customer customer)
	{
		Customer updateCustomer=service.updateCustomer(cid);
		if(updateCustomer!=null)
		{
			updateCustomer.setName(customer.getName());
			updateCustomer.setCity(customer.getCity());
			service.saveCustomer(updateCustomer);
			return ResponseEntity.ok("Customer updated successfully");
		}
		return ResponseEntity.ok("Customer Id not Found");
	}
}
