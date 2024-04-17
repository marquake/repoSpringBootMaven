package com.springweb.app;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.function.EntityResponse;

@Controller
public class ControladorJPAH2 {

	@Autowired
	ServicioJPAH2 servicioJPAH2;

	@Autowired
	ServicioJPAH2_order_queries servicioJPAH2_order_queries;

	
	@RequestMapping("/")
	public ResponseEntity getDatos() {
		
		servicioJPAH2.getDatos();
		return new ResponseEntity("Datos encontrados!", HttpStatus.OK);
	}

	@RequestMapping("/orderqueries")
	public ResponseEntity getDatosOrderQueries() {
		
		servicioJPAH2_order_queries.getDatos();
		return new ResponseEntity("Datos encontrados!", HttpStatus.OK);
	}

	// http://localhost:8080/parametros?id=12&nombre=juan
	@RequestMapping("/parametros")
	public ResponseEntity getDatosParametros(@RequestParam int id, @RequestParam String nombre) {
		return new ResponseEntity("id: " + id + " nombre: " + nombre, HttpStatus.OK);
	}

	//http://localhost:8080/parametrosNombre?id=12&nombre=juan
	@RequestMapping("/parametrosNombre")
	public ResponseEntity getDatosParametrosNombre(@RequestParam(name = "id") int paramId, 
												   @RequestParam(name = "nombre") String paramNombre) {

		String salida = "id: " + paramId + " paramNombre: " + paramNombre;

		return new ResponseEntity(salida, HttpStatus.OK);
	}

	// http://localhost:8080/parametrosNombreRequired
	@RequestMapping("/parametrosNombreRequired")
	public ResponseEntity getDatosParametrosNombreRequired(@RequestParam(name = "id", required = false, defaultValue = "0") int paramId, 
												   		   @RequestParam(name = "nombre", required = false, defaultValue = "No hay datos") String paramNombre) {

		String salida = "id: " + paramId + "\n paramNombre: " + paramNombre;

		return new ResponseEntity(salida, HttpStatus.OK);
	}

	//http://localhost:8080/multiparams?dato1=asdfas&dato2=2523&dato3=ttttt
	@RequestMapping("/multiparams")
	public ResponseEntity getDatosParametros(@RequestParam Map<String,String> allParams) {
		return new ResponseEntity(allParams.entrySet(), HttpStatus.OK);
	}
	
	// http://localhost:8080/listaparams?lista=1,2,3
	// http://localhost:8080/listaparams?lista=1&lista=2
	@RequestMapping("/listaparams")
	public ResponseEntity getDatosParametros(@RequestParam List<String> lista) {
		return new ResponseEntity(lista, HttpStatus.OK);
	}
}
