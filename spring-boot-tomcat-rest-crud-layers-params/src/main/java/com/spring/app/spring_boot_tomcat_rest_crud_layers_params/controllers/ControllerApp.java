package com.spring.app.spring_boot_tomcat_rest_crud_layers_params.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.spring_boot_tomcat_rest_crud_layers_params.components.CacheMonitor;
import com.spring.app.spring_boot_tomcat_rest_crud_layers_params.services.ServiceApp;

@RestController
@RequestMapping("/default")
public class ControllerApp {

	@Autowired
	ServiceApp serviceApp;

    @Autowired
    private CacheMonitor cacheMonitor;

	@GetMapping("/")
	public void test() {
		System.out.println("Ejecutando spring-boot-tomcat-rest-crud-layers-params...");
		
		cacheMonitor.displayCacheContents("Books");
		System.out.println("Exx");
				
	}

	@Cacheable
	@GetMapping("/list")
	public void list() {
		System.out.println("ControllerApp :: list(x)");
		serviceApp.list();
	}

	@PostMapping("/add")
	public void add() {
		System.out.println("ControllerApp :: add()");
		serviceApp.add();
		int i = 0;
		i =+ 1;
	}

	@PutMapping("/update")
	public void update() {
		System.out.println("ControllerApp :: update()");
		serviceApp.update();
	}

	@DeleteMapping("/delete")
	public void delete() {
		System.out.println("ControllerApp :: delete()");
		serviceApp.delete();
	}

}
