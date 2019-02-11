package com.tripeasy.web.TripEasy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	RestTemplate restTemplate;

	@Override
	public ResponseEntity<List> flightsFromSourceToDestination(String source, String destination) {
		String url = "http://localhost:7070/flight?source=" + source + "&destination=" + destination;
		return restTemplate.getForEntity(url, List.class);
	}

}
