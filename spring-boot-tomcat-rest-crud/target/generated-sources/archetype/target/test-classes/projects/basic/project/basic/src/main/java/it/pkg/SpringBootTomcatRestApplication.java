package it.pkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "it.pkg")
public class SpringBootTomcatRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTomcatRestApplication.class, args);
	}

}
