package com.mobiquity.atm.locator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mobiquity.atm.locator.dao.AtmLocatorData;
import com.mobiquity.atm.locator.dao.AtmLocatorDataImpl;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
@EnableWebMvc
public class AtmLocatorApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(AtmLocatorApplication.class, args);
	}

	@Bean
	public AtmLocatorData atmLocatorData()
	{
		return new AtmLocatorDataImpl();
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder)
	{
		return builder.build();
	}
	
	@Bean
	public Docket api() {
	    return new Docket(DocumentationType.SWAGGER_2)
	      .select()
	      .apis(RequestHandlerSelectors.basePackage("com.mobiquity.atm.locator"))
	      .paths(PathSelectors.any())
	      .build();
	}  
}
