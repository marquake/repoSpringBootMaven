package com.springweb.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller("/")
public class Controlador {

	public Controlador() {
		// TODO Auto-generated constructor stub
	}

//	@GetMapping("/")
//	public String getDatos() {
//		System.out.println("método!");
//		return "";
//	}

	//@RequestMapping(method = RequestMethod.GET)
	@GetMapping
	public ModelAndView inicio() {
		System.out.println("Llamando al controller");
		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("Hola");
//		mav.getModel().put("data", "Esto es una cadena, hola");
//
		return null;
	}

}
