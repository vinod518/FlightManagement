package com.org.yogi.service;

import java.math.BigInteger;

import com.org.yogi.model.Booking;
import org.springframework.http.ResponseEntity;

public interface BookingService {

	public ResponseEntity<?> createBooking(Booking newBooking);

	public Booking updateBooking(Booking newBooking);

	public String deleteBooking(BigInteger bookingId);

	public Iterable<Booking> displayAllBooking();

	public ResponseEntity<?> findBookingById(BigInteger bookingId);
}
