package com.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Product;
import com.jwt.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/addProduct", method=RequestMethod.POST)
	public ModelAndView addingProduct(@Validated @ModelAttribute Product product) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		productService.addProduct(product);
		String message = "product was successfully added.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
	
	@RequestMapping(value="/editProduct/{id}", method=RequestMethod.POST)
	public ModelAndView edditingProduct(@ModelAttribute Product product, @PathVariable Integer id) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		productService.updateProduct(product);
		String message = "Product was successfully edited.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
	
	@RequestMapping(value="/deleteProduct/{id}", method=RequestMethod.GET)
	public ModelAndView deleteProduct(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("home");
		productService.deleteProduct(id);
		String message = "Product was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
}
