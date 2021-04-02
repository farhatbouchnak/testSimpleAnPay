package com.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Marchand;
import com.jwt.service.MarchandService;


@Controller
public class MarchandController {

	@Autowired
	private MarchandService marchandService;
	
	@RequestMapping(value="/addMarchand", method=RequestMethod.POST)
	public ModelAndView addingMarchand(@Validated @ModelAttribute Marchand marchand) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		marchandService.addMarchand(marchand);
		String message = "Marchand was successfully added.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
	
	@RequestMapping(value="/editMarchand/{id}", method=RequestMethod.POST)
	public ModelAndView edditingAluno(@ModelAttribute Marchand marchand, @PathVariable Integer id) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		marchandService.updateMarchand(marchand);
		String message = "Aluno was successfully edited.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
	
	@RequestMapping(value="/deleteMarchand/{id}", method=RequestMethod.GET)
	public ModelAndView deleteMarchand(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("home");
		marchandService.deleteMarchand(id);
		String message = "Marchand was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
}
