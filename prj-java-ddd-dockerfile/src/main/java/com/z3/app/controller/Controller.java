package com.z3.app.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.z3.app.data.Persona;
import com.z3.app.service.ServiciePersona;

@RestController("/api")
public class Controller {

	@Autowired
	ServiciePersona servicio;

	@RequestMapping("/api/personas")
	@ResponseBody
	public List<Persona> testControler() throws UnknownHostException {

		System.out.println("Controller :: testControler()");

		return servicio.getAll();
	}
}