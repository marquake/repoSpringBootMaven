#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ${package}.services.ServiceApp;

@RestController
@RequestMapping("/")
public class ControllerApp {

	@Autowired
	ServiceApp serviceApp;

	@GetMapping("/")
	public void test() {
		System.out.println("Ejecutando ${artifactId}...");
	}

	@GetMapping("/list")
	public void list() {
		System.out.println("ControllerApp :: list()");
		serviceApp.list();
	}

	@PostMapping("/add")
	public void add() {
		System.out.println("ControllerApp :: add()");
		serviceApp.add();
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
