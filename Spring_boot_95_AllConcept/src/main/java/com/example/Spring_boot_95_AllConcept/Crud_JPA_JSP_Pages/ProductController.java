package com.example.Spring_boot_95_AllConcept.Crud_JPA_JSP_Pages;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@Autowired
	private productService service;
	
	@PreAuthorize("hasAnyRole('User', 'Admin')")
	@RequestMapping("/list")
	public String getProductList(Model model)
	{
		List<Product> productList=service.listProduct();
		model.addAttribute("productList", productList);
		return "Product_Success";
	}
	 @Secured("Admin")
	@RequestMapping("/add_product")
	public String addProducts(Model model,Product product)
	{
		Product product1=new Product();
		model.addAttribute("product", product1);
		return "Add_Product";
	}
	@PreAuthorize("hasAnyRole('Admin')")
	@PostMapping("/saveProduct")
	public String saveProducts(@ModelAttribute Product product)
	{
		service.saveProduct(product);
		return "redirect:/list";
	}
	  @PreAuthorize("hasRole('User')")
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id)
	{
		service.deleteProduct(id);
		return "redirect:/list";
	}
	
	@RequestMapping("/update/{id}")
	public ModelAndView updateProduct(@PathVariable int id)
	{
		ModelAndView mav=new ModelAndView("Product_update");
		Product product=service.updateProduct(id);
		mav.addObject("product", product);
		return mav;
	}
}

