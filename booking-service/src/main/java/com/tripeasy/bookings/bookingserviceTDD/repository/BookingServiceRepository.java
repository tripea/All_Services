package com.tripeasy.bookings.bookingserviceTDD.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tripeasy.bookings.bookingserviceTDD.entity.Booking;


@Repository
public interface BookingServiceRepository extends MongoRepository<Booking, Integer> {

	List<Booking> findAllByHotelHotelId(Integer hotelId);

}
