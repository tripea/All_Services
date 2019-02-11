package com.tripeasy.search;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tripeasy.search.entity.Search;
import com.tripeasy.search.repository.SearchRepository;

@SpringBootApplication
public class SearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner init(SearchRepository repository) {

		return (evt) -> {

			repository.save(new Search("Hyderabad","Telangana","India","Flight","Hyd","RGIA"));
			repository.save(new Search("Pune","Maharastra","India","Flight","PNE","PS"));

			repository.save(new Search("Mumbai","Maharastra","India","Flight","MUM","CST"));

			repository.save(new Search("Bangalore","Karnata","India","Flight","BLR","SRS"));

			repository.save(new Search("Chennai","TamilNadu","India","Flight","CHE","SDS"));

			repository.save(new Search("Cochin","Kerela","India","Flight","COCH","RG"));

		

			repository.save(new Search("Delhi","New Delhi","India","Hotel"));
			repository.save(new Search("Hyderabad","Telangana","India","Hotel"));
			repository.save(new Search("Secunderabad","Telangana","India","Hotel"));
			repository.save(new Search("Mumbai","Mahrastra","India","Hotel"));
			repository.save(new Search("Pune","Mahrastra","India","Hotel"));
			repository.save(new Search("Bangalore","Karnataka","India","Hotel"));
			
			
		};
	}
	}


