package com.marquake.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageDisplayController {

	public MessageDisplayController() {
	}

	@RequestMapping(value="/hi")
	public ModelAndView diHola(Model model) {
		model.addAttribute("mensaje", "hola");
		
		return new ModelAndView("home");
	}

	@RequestMapping(value="/adios")
	public ModelAndView diAdios(Model model) {
		model.addAttribute("mensaje", "adiós");
		
		return new ModelAndView("home");
	}

}
