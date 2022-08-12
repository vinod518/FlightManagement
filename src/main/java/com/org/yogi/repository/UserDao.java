package com.org.yogi.repository;

import com.org.yogi.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;



public interface UserDao extends JpaRepository<Users, BigInteger> {

}