package com.example.Spring_boot_95_AllConcept.StudentDemo;

import java.util.*;

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

//@Controller
@RestController
@RequestMapping("/api/Students/")
public class StudentController {

	
//	@GetMapping("/login_Page")
//	public String LoginPages()
//	{
//		System.out.println("login page calling");
//		return "login";
//	}
//	
//	@GetMapping("/Sign_Page")
//	public String SignUpPages()
//	{
//		System.out.println("signup page calling");
//		return "signup";
//	}
	
	private List<Student> studentList=new ArrayList<>();
	
	@GetMapping
	public List<Student> getAllStudents()
	{
		return studentList;
	}
	
	@PostMapping
	public String saveStudents(@RequestBody Student student)
	{
		Student student1=new Student();
		studentList.add(student1);
	return "Student Added Successfully";	
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		studentList.removeIf(p->p.getId()==id);
		return "student"+id+"deleted Successfully";
	}
	
	@PutMapping("/{id}")
	public String updateStudent(@PathVariable int id,@ModelAttribute Student students)
	{
	
		for(Student std:studentList)
		{
			if(std.getId()==id)
			{
				std.setName(students.getName());
				std.setCity(students.getCity());
				std.setMarks(students.getMarks());
				return "students update successfully";
			}
		}
		return "student Id not successfully";
	}
	
}
