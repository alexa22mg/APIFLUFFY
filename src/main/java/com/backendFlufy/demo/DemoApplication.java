package com.backendFlufy.demo;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

     @Bean
	public OpenAPI crarapi(){
		return new OpenAPI()
				.info(new Info()
						.title("Ecommerce Para Mascotas Fluffy API")
						.version("0.1")
						.description("Proyecto Educativo")
						.termsOfService("http://swagger.io/terms/")
						.license(new License().name("Apache2.0").url("http://sprindoc.org"))
				);
	 }



}
