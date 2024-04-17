package com.spring.app.spring_boot_tomcat_rest_crud_layers_params;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCaching
@ComponentScan(basePackages = "com.spring.app.spring_boot_tomcat_rest_crud_layers_params")
public class SpringBootTomcatRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTomcatRestApplication.class, args);
	}

}
