package com.loanprocessing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public OpenAPI customeOpenApi() {
		return new OpenAPI()
				.info(new Info()
						.title("Loan Processing System API")
						.version("1.0")
						.description("API documentation for the Loan Processing System"));
	}

}
