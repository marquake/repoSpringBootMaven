package com.marquake.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mensajes")
public class MessageDisplayController {

	@RequestMapping(value="/di10")
	public ModelAndView di10(Model model) {
		
		model.addAttribute("mensaje", "Hola");

		return new ModelAndView("home.jsp");
	}

	@RequestMapping(value="/di20")
	public ModelAndView di20(Model model) {
		
		model.addAttribute("mensaje", "Adiós");

		return new ModelAndView("home.jsp");
	}
}
