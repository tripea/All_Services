package com.tripeasy.search.service;

import java.util.List;
import java.util.Optional;

import com.tripeasy.search.entity.Search;

public interface SearchService {

	

	
	List<Search> getAllHotels();
	

	Search addNewCity(Search search);

	List<Search> findAllByType(String type);

	Search updateCity(Search search);

	
	
	 void deleteCity(Integer cityId); 

	

	Optional<Search> getCityById(Integer cityId);

	

}
