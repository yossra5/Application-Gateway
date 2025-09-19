package com.esprit.microservice.appligateway4sae1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaClient
@SpringBootApplication
public class AppliGateway4Sae1Application {

	public static void main(String[] args) {
		SpringApplication.run(AppliGateway4Sae1Application.class, args);
	}

}
