package com.tripeasy.bookings.bookingserviceTDD.service;

import java.util.List;
import java.util.Optional;

import com.tripeasy.booking.bookingserviceTDD.exception.InvalidInputException;
import com.tripeasy.bookings.bookingserviceTDD.entity.Booking;

public interface BookingService {
	
	List<Booking> getAllBookings();

	void addBookings(Booking booking) throws InvalidInputException;
	//List<Booking> getListOfAllBookings();

	Optional<Booking> getBookingById(Integer bookingID);

	//void updateBooking(Booking booking1);

	void deleteBooking(Integer bookingID);

	void saveBooking(Booking booking1);

	List<Booking> getBookingListOfHotelById(Integer hotelId);
	

}