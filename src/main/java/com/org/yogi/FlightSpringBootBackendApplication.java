package com.org.yogi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.org.yogi")
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class FlightSpringBootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightSpringBootBackendApplication.class, args);
	}
}
