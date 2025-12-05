package com.example.Spring_boot_95_AllConcept.jspPages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginPageDemoController {

	@RequestMapping("/login")
	public String loginPages()
	{
		System.out.println("showing the login pages");
	return "login";
	}
	
	@RequestMapping("/signup")
	public String signupPages()
	{
		System.out.println("showing the signup pages");
	return "signup";
	}
}
