package com.spring.app.spring_boot_tomcat_rest_crud_layers_params.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.spring_boot_tomcat_rest_crud_layers_params.services.ServiceApp;

@RestController
@RequestMapping("/params")
public class ControllerAppParams {

	@Autowired
	ServiceApp serviceApp;

	// http://localhost:8080/params/
	@GetMapping("/")
	public void test() {
		System.out.println("Ejecutando spring-boot-tomcat-rest-crud-layers-params...");
	}

	// http://localhost:8080/params/list
	@GetMapping("/list")
	public void list() {
		System.out.println("ControllerAppParams :: list()");
		serviceApp.list();
	}

	//http://localhost:8080/params/add?name=juan
	@GetMapping("/add")
	public void add(@RequestParam String name) {
		System.out.println("ControllerAppParams :: add(): " + name);
		serviceApp.add();
	}

	//http://localhost:8080/params/update?name=juan
	@GetMapping("/update")
	public void update(@RequestParam(required = false, defaultValue = "") String name) {
		System.out.println("ControllerAppParams :: update(): " + name);
		serviceApp.update();
	}

	//http://localhost:8080/params/update?name=juan
	@GetMapping("/updateValidated")
	public void update2(@Validated @RequestParam(required = false, defaultValue = "") String name) {
		System.out.println("ControllerAppParams :: update(): " + name);
		serviceApp.update();
	}

	// http://localhost:8080/params/delete/1
	// http://localhost:8080/params/delete/342
	@GetMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		System.out.println("ControllerAppParams :: delete(): " + id);
		serviceApp.delete();
	}

}