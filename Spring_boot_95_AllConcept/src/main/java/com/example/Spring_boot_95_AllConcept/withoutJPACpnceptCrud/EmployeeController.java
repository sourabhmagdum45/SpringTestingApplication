package com.example.Spring_boot_95_AllConcept.withoutJPACpnceptCrud;

import java.util.*;

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
@RequestMapping("/api/employee/")
public class EmployeeController {

	private List<Employee> empList=new ArrayList<>();
	
	@GetMapping
	public List<Employee> getList()
	{
		System.out.println("showing employee list"+empList);
		return empList;
	}
	
	@PostMapping
	public String saveEmployee(@RequestBody Employee employee)
	{
		empList.add(employee);
		return "Employee save successfully";
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		empList.removeIf(p->p.getId()==id);
		return "employee deleted Successfully";
	}
	
	@PutMapping("/{id}")
	public String updatEmployee(@PathVariable int id,@RequestBody Employee employee)
	{
		for(Employee emp:empList)
		{
			if(emp.getId()==id)
			{
				emp.setName(employee.getName());
				emp.setDept(employee.getDept());
				emp.setSalary(employee.getSalary());
			return "employee updated successfully";
			}
		}
		return "employee not found";	
		}
	}

