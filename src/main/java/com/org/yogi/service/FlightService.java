package com.org.yogi.service;

import java.math.BigInteger;

import org.springframework.http.ResponseEntity;

import com.org.yogi.model.Flight;

public interface FlightService {
	public ResponseEntity<?> addFlight(Flight flight);

	public Iterable<Flight> viewAllFlight();

	public Flight viewFlight(BigInteger flightNumber);

	public Flight modifyFlight(Flight flight);

	public String removeFlight(BigInteger flightNumber);

}
