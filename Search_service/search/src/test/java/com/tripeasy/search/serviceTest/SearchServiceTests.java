package com.tripeasy.search.serviceTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tripeasy.search.entity.Search;
import com.tripeasy.search.service.SearchService;

@RunWith(SpringRunner.class)

@SpringBootTest
//@DataJpaTest
public class SearchServiceTests {

	@Autowired

	private SearchService service;

	Search search= new Search(1, "Hyderabad", "Telanagana", "India", "Flight","HYD","Rajiv Gandhi");
	
	

	@Test

	public void testForGetAllNumber() throws Exception {
		List<Search> search = service.getAllHotels();

		assertEquals(30, search.size());
	}

	@Test

	public void testForHotelCityList() throws Exception {

		List<Search> search = service.findAllByType("Hotel");
		assertEquals(17, search.size());
	}

	@Test

	public void testForFlightCityList() throws Exception {
		List<Search> search = service.findAllByType("Flight");
		assertEquals(10, search.size());
	}

	@Test()

	public void testForAddingNewCity() throws Exception {
		Search result = service.addNewCity(search);
		assertEquals("Rajiv Gandhi", result.getAirportName());

	}

	@Test

	public void testForUpdatingCity() throws Exception {
		Search search=service.getCityById(37).get();
		search.setAirportName("NNAAAAIR");
		Search searchObject = service.updateCity(search);
		assertEquals("NNAAAAIR", searchObject.getAirportName());
	}

	@Test

	public void testForDeletingCity() throws Exception {
		service.deleteCity(34);
		Optional<Search> deletedCity=service.getCityById(34);
		assertFalse(deletedCity.isPresent());
	}

	@Test

	public void testForGetCityById() throws Exception {
		Search result = service.getCityById(1).get();
		
		assertEquals("Rajiv Gandhi",result.getAirportName());
	}

}
