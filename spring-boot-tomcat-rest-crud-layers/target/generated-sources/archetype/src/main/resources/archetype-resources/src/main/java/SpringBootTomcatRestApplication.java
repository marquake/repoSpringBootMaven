#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "${package}")
public class SpringBootTomcatRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTomcatRestApplication.class, args);
	}

}
