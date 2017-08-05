package fr.mdarfilal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "fr.mdarfilal")
public class JaxWsInitiationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaxWsInitiationApplication.class, args);
	}
}
