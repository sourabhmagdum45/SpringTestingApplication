package com.example.Spring_boot_95_AllConcept;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class demoController {

	
	@RequestMapping("/homePage")
	public String demo()
	{
		System.out.println("displaing the HTml Pages");
		return "index.html";
	}
	
	@RequestMapping("/contacts")
	public String contactPage()
	{
		System.out.println("displaying contact details");
		return "contact.html";
	}
	}

