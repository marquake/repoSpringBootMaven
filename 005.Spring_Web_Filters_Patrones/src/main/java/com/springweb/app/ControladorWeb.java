package com.springweb.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControladorWeb {

	@RequestMapping(path = "/*", method = RequestMethod.GET)
	public ResponseEntity inicio() {
		System.out.println("Llamando al controller");

		return new ResponseEntity("dato", HttpStatus.OK);
	}
	
}
