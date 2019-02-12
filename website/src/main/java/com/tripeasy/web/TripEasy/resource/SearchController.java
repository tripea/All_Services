package com.tripeasy.web.TripEasy.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.tripeasy.web.TripEasy.pojo.Hotel;

@Controller
@RequestMapping("/search")
public class SearchController {
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/searchFlights")
	public ModelAndView getAllCityForFlight() {
		List<Hotel> flightList = restTemplate.getForObject("http://localhost:8989/cities/Flight", List.class);
		return new ModelAndView("FlightSearch", "flightList", flightList);
	}

	@RequestMapping("/searchHotels")
	public ModelAndView getAllCityForHotel() {
		List<Hotel> hotelCityList = restTemplate.getForObject("http://localhost:8989/cities/Hotel", List.class);
		return new ModelAndView("HotelSearch", "hotelCityList", hotelCityList);
	}

	@RequestMapping(value= "/searchFlight", method=RequestMethod.POST)
	public String searchFlight(@RequestParam String source,@RequestParam String destination) {
		return "redirect:http://localhost:8764/flight/flights?source="+source+"&destination="+destination;
	}
	
	@RequestMapping(value= "/searchHotel", method=RequestMethod.POST)
	public String searchHotel(@RequestParam String city){
		System.out.println("in search " +city);
		return "redirect:http://localhost:8764/hotel/hotels?city="+city;
	}
}
