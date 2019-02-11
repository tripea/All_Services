package com.tripeasy.search.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripeasy.search.entity.Search;
import com.tripeasy.search.repository.SearchRepository;
@Service
public class SearchServiceImpl implements SearchService {
	
	@Autowired
	private SearchRepository repository;

	@Override
	public List<Search> getAllHotels() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	/*
	 * @Override public void addNewCity(Search search) { // TODO Auto-generated
	 * method stub
	 * 
	 * repository.save(search);
	 * 
	 * }
	 */

	/*
	 * @Override public List<Search> findAllByType(String type) { // TODO
	 * Auto-generated method stub return repository.findAllByType(type); }
	 */

	@Override
	public Search addNewCity(Search search) {
		// TODO Auto-generated method stub
		return repository.save(search);
	}

	@Override
	public List<Search> findAllByType(String type) {
		// TODO Auto-generated method stub
		return repository.findAllByType(type);
	}

	@Override
	public Search updateCity(Search search) {
		// TODO Auto-generated method stub
		return repository.save(search);
	}

	@Override
	public void deleteCity(Integer cityId) {
		// TODO Auto-generated method stub
		
		repository.deleteById(cityId);
		
	}

	@Override
	public Optional<Search> getCityById(Integer cityId) {
		// TODO Auto-generated method stub
		return repository.findById(cityId);
	}

	
}
