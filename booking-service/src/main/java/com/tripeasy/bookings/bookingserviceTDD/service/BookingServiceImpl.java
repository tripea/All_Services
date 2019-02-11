package com.tripeasy.bookings.bookingserviceTDD.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripeasy.booking.bookingserviceTDD.exception.InvalidInputException;
import com.tripeasy.bookings.bookingserviceTDD.entity.Booking;
import com.tripeasy.bookings.bookingserviceTDD.repository.BookingServiceRepository;
//import com.tripeasy.bookings.bookingserviceTDD.repository.BookingServiceRepository;
//import com.tripeasy.bookings.bookingserviceTDD.repository.FlightBookingServiceRepository;
//import com.tripeasy.bookings.bookingserviceTDD.repository.HotelBookingServiceRepository;
import com.tripeasy.hotel.hotelservice.entity.Hotel;

@Service
public class BookingServiceImpl implements BookingService {

	
	@Autowired
	private BookingServiceRepository repository;

	@Override
	public List<Booking> getAllBookings() {
		return repository.findAll();
	}

	@Override
	public void addBookings(Booking booking) throws InvalidInputException {
		try {
			repository.save(booking);
		} catch (Exception e) {
			throw new InvalidInputException("Invalid Input");
		}
	}

	/*
	 * @Override public void addNewHotel(Hotel hotel) throws InvalidInputException {
	 * try { hotelRepository.save(hotel); } catch (Exception e) { throw new
	 * InvalidInputException("Invalid  input Data "); }
	 * 
	 * }
	 */
	@Override
	public Optional<Booking> getBookingById(Integer bookingID) {
		return repository.findById(bookingID);
	}

	@Override
	public void deleteBooking(Integer bookingID) {
		repository.deleteById(bookingID);
	}

	@Override
	public void saveBooking(Booking booking1) {
		repository.save(booking1);

	}

	@Override
	public List<Booking> getBookingListOfHotelById(Integer hotelId) {
		return repository.findAllByHotelHotelId(hotelId);
	}

}
