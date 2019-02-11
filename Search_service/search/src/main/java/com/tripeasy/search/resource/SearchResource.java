package com.tripeasy.search.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tripeasy.search.entity.Search;
import com.tripeasy.search.service.SearchService;

@RestController
@RequestMapping("/cities")
public class SearchResource {

	@Autowired
	private SearchService service;

	/*
	 * @GetMapping
	 * 
	 * public List<Search> getAllHotels() { return service.getAllHotels(); }
	 */
	/*
	 * @PostMapping("/add") public void addNewCity(@RequestBody Search search) {
	 * service.addNewCity(search); }
	 */

	/*
	 * @GetMapping("/{type}")
	 * 
	 * public List<Search> getAllCitiesByType(@PathVariable String type) { return
	 * service.findAllByType(type);
	 * 
	 * }
	 */

	@PostMapping()
	public ResponseEntity<Search> addANewCity(@RequestBody Search search) {
		service.addNewCity(search);
		return new ResponseEntity<Search>(HttpStatus.CREATED);
	}

	@GetMapping("/{type}")
	public ResponseEntity<List<Search>> searchAllByType(@PathVariable String type) {
		List<Search> search = service.findAllByType(type);
		if (search.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(search, HttpStatus.OK);
	}

	@GetMapping("search/{cityId}")
	public ResponseEntity<Optional<Search>> getCitiesByCityId(@PathVariable Integer cityId) {
		Optional<Search> search = service.getCityById(cityId);
		if (search.isPresent()) {
			return new ResponseEntity<>(search, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/{cityId}")

	public ResponseEntity<Optional<Search>> deleteAccount(@PathVariable Integer cityId) {
		
		Optional<Search> search = service.getCityById(cityId);
		if (search.isPresent()) {
			service.deleteCity(cityId);
			return new ResponseEntity<Optional<Search>>(search, HttpStatus.OK);
		}
		return new ResponseEntity<Optional<Search>>(HttpStatus.NOT_FOUND);

	}

	@PutMapping

	public ResponseEntity<Search> updateCity(@RequestBody Search search) {
		service.updateCity(search);
		return new ResponseEntity<Search>(HttpStatus.OK);
	}

}
