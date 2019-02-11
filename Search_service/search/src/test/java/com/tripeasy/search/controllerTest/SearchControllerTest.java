package com.tripeasy.search.controllerTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.tripeasy.search.entity.Search;

@RunWith(SpringRunner.class)

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SearchControllerTest {

	@Autowired

	private TestRestTemplate testRestTemplate;

	// Tests for Bad Url Requests
	@Test
	public void testForBadUrl() throws Exception {
		ResponseEntity<String> responseEntity = testRestTemplate.getForEntity("/city", String.class);
		assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
	}

	@Test
	public void testOfBadRequest() throws Exception {

		ResponseEntity<String> responseEntity = testRestTemplate.getForEntity("/cities/Flight/uuuu", String.class);
		assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());

	}

	// Tests For GetCities By Type and Id
	@Test

	public void getCitiesByFlightTypeTest() throws Exception {
		ResponseEntity<String> responseEntity = testRestTemplate.getForEntity("/cities/Flight", String.class);
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}

	@Test

	public void getCitiesByHotelTypeTest() throws Exception {
		ResponseEntity<String> responseEntity = testRestTemplate.getForEntity("/cities/Hotel", String.class);
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}
	
	@Test

	public void getCitiesByWrongTypeTest() throws Exception {
		ResponseEntity<String> responseEntity = testRestTemplate.getForEntity("/cities/Pavan", String.class);
		assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
	}

	@Test
	public void testGetCityWhichIsNotThere() {
		ResponseEntity<String> responseEntity = testRestTemplate.getForEntity("/cities/search/45", String.class);
		assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
	}

	@Test

	public void getCityByIdTest() throws Exception {
		ResponseEntity<String> responseEntity = testRestTemplate.getForEntity("/cities/search/2", String.class);
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}

	// Tests for Adding City

	@Test

	public void addNewCityTest() throws Exception {
		Search add = new Search("Chennai", "Tamil Nadu", "India", "CHE");
		ResponseEntity<String> responseEntity = testRestTemplate.postForEntity("/cities", add, String.class);
		assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
	}

	@Test

	public void addNewCityTestForWrongUrl() throws Exception {
		Search add = new Search("Chennai", "Tamil Nadu", "India", "CHE");
		ResponseEntity<String> responseEntity = testRestTemplate.postForEntity("/city", add, String.class);
		assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
	}

	// Tests for Deleting City
	@Test

	public void deleteCityByIdTest() throws Exception {

		testRestTemplate.delete("/cities/33");
		ResponseEntity<String> responseEntity = testRestTemplate.getForEntity("/cities/33", String.class);
		assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
	}

	@Test

	public void deleteCityByIdWhichDoesntExistTest() throws Exception {

		testRestTemplate.delete("/cities/40");
		ResponseEntity<String> responseEntity = testRestTemplate.getForEntity("/cities/40", String.class);
		assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
	}

	//Tests for Update 
	@Test

	public void updateCityTest() throws Exception {
		Search updatedSearch = new Search("Chennai", "Tamil Nadu", "India", "CHEN");

		testRestTemplate.put("/cities/36", updatedSearch);
		 assertEquals("CHEN", updatedSearch.getType());

	}

}
