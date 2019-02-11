package com.tripeasy.bookings.bookingserviceTDD.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import com.tripeasy.bookings.bookingserviceTDD.hotelentity.Hotel;

@Component
public class Booking {

	@Id
	private Integer bookingID;
	private String bookingType;
	private Object bookingDetails;
	private LocalDateTime dateOfBooking;
	private Double totalCost;
	private List<Customer> customers;
	private Profile bookedBy;
	private Hotel hotel;
	private Flight flight;
	private LocalDateTime checkInDate;
	private LocalDateTime checkOutDate;

	public Booking() {
		super();

	}

	public Booking(Integer bookingID, String bookingType, Object bookingDetails, LocalDateTime dateOfBooking,
			Double totalCost, ArrayList<Customer> customers, Profile bookedBy) {
		super();
		this.bookingID = bookingID;
		this.bookingType = bookingType;
		this.bookingDetails = bookingDetails;
		this.dateOfBooking = dateOfBooking;
		this.totalCost = totalCost;
		this.customers = customers;
		this.bookedBy = bookedBy;
	}

	public Booking(Integer bookingID, String bookingType, Object bookingDetails, LocalDateTime dateOfBooking,
			Double totalCost, List<Customer> customers, Profile bookedBy, Hotel hotel, LocalDateTime checkInDate,
			LocalDateTime checkOutDate) {
		super();
		this.bookingID = bookingID;
		this.bookingType = bookingType;
		this.bookingDetails = bookingDetails;
		this.dateOfBooking = dateOfBooking;
		this.totalCost = totalCost;
		this.customers = customers;
		this.bookedBy = bookedBy;
		this.hotel = hotel;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}

	public Booking(Integer bookingID, String bookingType, Object bookingDetails, LocalDateTime dateOfBooking,
			Double totalCost, List<Customer> customers, Profile bookedBy, Hotel hotel, Flight flight,
			LocalDateTime checkInDate, LocalDateTime checkOutDate) {
		super();
		this.bookingID = bookingID;
		this.bookingType = bookingType;
		this.bookingDetails = bookingDetails;
		this.dateOfBooking = dateOfBooking;
		this.totalCost = totalCost;
		this.customers = customers;
		this.bookedBy = bookedBy;
		this.hotel = hotel;
		this.flight = flight;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}

	/*
	 * public Booking(Integer bookingID, String bookingType, Object bookingDetails,
	 * LocalDateTime dateOfBooking, Double totalCost, List<Customer> customers,
	 * Profile bookedBy, Hotel hotel, LocalDateTime checkInDate, LocalDateTime
	 * checkOutDate) { super(); this.bookingID = bookingID; this.bookingType =
	 * bookingType; this.bookingDetails = bookingDetails; this.dateOfBooking =
	 * dateOfBooking; this.totalCost = totalCost; this.customers = customers;
	 * this.bookedBy = bookedBy; this.hotel = hotel; this.checkInDate = checkInDate;
	 * this.checkOutDate = checkOutDate; }
	 */

	public Integer getBookingID() {
		return bookingID;
	}

	public void setBookingID(Integer bookingID) {
		this.bookingID = bookingID;
	}

	public String getBookingType() {
		return bookingType;
	}

	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}

	public Object getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(Object bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

	public LocalDateTime getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(LocalDateTime dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers2) {
		this.customers = customers2;
	}

	public Profile getBookedBy() {
		return bookedBy;
	}

	public void setBookedBy(Profile bookedBy) {
		this.bookedBy = bookedBy;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public LocalDateTime getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDateTime checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDateTime getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDateTime checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookedBy == null) ? 0 : bookedBy.hashCode());
		result = prime * result + ((bookingDetails == null) ? 0 : bookingDetails.hashCode());
		result = prime * result + ((bookingID == null) ? 0 : bookingID.hashCode());
		result = prime * result + ((bookingType == null) ? 0 : bookingType.hashCode());
		result = prime * result + ((checkInDate == null) ? 0 : checkInDate.hashCode());
		result = prime * result + ((checkOutDate == null) ? 0 : checkOutDate.hashCode());
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
		result = prime * result + ((dateOfBooking == null) ? 0 : dateOfBooking.hashCode());
		result = prime * result + ((flight == null) ? 0 : flight.hashCode());
		result = prime * result + ((hotel == null) ? 0 : hotel.hashCode());
		result = prime * result + ((totalCost == null) ? 0 : totalCost.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		if (bookedBy == null) {
			if (other.bookedBy != null)
				return false;
		} else if (!bookedBy.equals(other.bookedBy))
			return false;
		if (bookingDetails == null) {
			if (other.bookingDetails != null)
				return false;
		} else if (!bookingDetails.equals(other.bookingDetails))
			return false;
		if (bookingID == null) {
			if (other.bookingID != null)
				return false;
		} else if (!bookingID.equals(other.bookingID))
			return false;
		if (bookingType == null) {
			if (other.bookingType != null)
				return false;
		} else if (!bookingType.equals(other.bookingType))
			return false;
		if (checkInDate == null) {
			if (other.checkInDate != null)
				return false;
		} else if (!checkInDate.equals(other.checkInDate))
			return false;
		if (checkOutDate == null) {
			if (other.checkOutDate != null)
				return false;
		} else if (!checkOutDate.equals(other.checkOutDate))
			return false;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		if (dateOfBooking == null) {
			if (other.dateOfBooking != null)
				return false;
		} else if (!dateOfBooking.equals(other.dateOfBooking))
			return false;
		if (flight == null) {
			if (other.flight != null)
				return false;
		} else if (!flight.equals(other.flight))
			return false;
		if (hotel == null) {
			if (other.hotel != null)
				return false;
		} else if (!hotel.equals(other.hotel))
			return false;
		if (totalCost == null) {
			if (other.totalCost != null)
				return false;
		} else if (!totalCost.equals(other.totalCost))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Booking [bookingID=" + bookingID + ", bookingType=" + bookingType + ", bookingDetails=" + bookingDetails
				+ ", dateOfBooking=" + dateOfBooking + ", totalCost=" + totalCost + ", customers=" + customers
				+ ", bookedBy=" + bookedBy + ", hotel=" + hotel + ", flight=" + flight + ", checkInDate=" + checkInDate
				+ ", checkOutDate=" + checkOutDate + "]";
	}

}