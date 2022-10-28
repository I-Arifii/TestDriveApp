package com.example.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Booking ID does not exist")
public class BookingNotFoundException extends EntityNotFoundException{
	public BookingNotFoundException() {}
	public BookingNotFoundException(String msg) {
		super(msg);
	}

}