package com.bridgelabz.hellomessagingapp;
/**
 * Purpose: To Simulate With First Spring App
 *
 * @author ASIM AHAMMED
 * @version 2.6.0
 * @since 30-11-2021
 */

import com.bridgelabz.hellomessagingapp.dto.NameDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloMessagingAppApplication {
	public static final Logger logger = LoggerFactory.getLogger(HelloMessagingAppApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run(HelloMessagingAppApplication.class, args);
		NameDto user = context.getBean(NameDto.class);
		logger.debug("User Bean = " + user.toString());
		user.setFirstName("ASIM");
		user.setLastName("AHAMMED");
		logger.debug("User Bean = " + user.toString());
	}
}