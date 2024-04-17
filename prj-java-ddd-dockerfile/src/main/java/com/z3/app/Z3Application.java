package com.z3.app;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication
//@EnableJpaRepositories( basePackages = {"com.z3"} )
//@EntityScan( basePackages = {"com.z3"} )

@SpringBootApplication
public class Z3Application {

	public static void main(String[] args) throws UnknownHostException {
		SpringApplication.run(Z3Application.class, args);
		
		System.out.println( "Hola! Puedes encontrarme en " + InetAddress.getLocalHost().getHostAddress());

	}

}