package com.tripeasy.web.TripEasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableOAuth2Sso
public class TripEasyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripEasyApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	 
}

