package com.marquake.Spring_Web_Interceptor_rest_3.data.jpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {

	public Controlador() {

	}

	@RequestMapping("/")
	public void getDatos() {
		System.out.println("hola controlador");
	}
}
