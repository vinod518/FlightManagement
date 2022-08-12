package com.org.yogi.repository;

import com.org.yogi.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
@Repository
public interface FlightDao extends JpaRepository<Flight,BigInteger> {

}
