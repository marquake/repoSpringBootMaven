package com.marquake.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/menuapp")
public class ControladorMenuPagar {

	@RequestMapping(value="/menu")
	public ModelAndView di10(Model model) {
		
		model.addAttribute("mensaje", "Hola");

		return new ModelAndView("menu");
	}

	@RequestMapping(value="/pagar")
	public ModelAndView di20(Model model) {
		
		model.addAttribute("mensaje", "Adiós");

		return new ModelAndView("pagar");
	}
}
