package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class ControllerAutowire {

	@Autowired
	Servicio servicio;

	@RequestMapping("/api/test")
	public void testControler() {
		System.out.println("test Controler");
		
		servicio.TestServicio();
		
		servicio.getAll();
	}
}
