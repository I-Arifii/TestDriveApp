package com.example.rest.controller;

import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.persitence.domain.Booking;
import com.example.rest.dto.BookingDTO;
import com.example.service.BookingService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BookingController {
	@Autowired
	private BookingService service;
	
	@PostMapping("/addBooking")
	public BookingDTO addBooking(@RequestBody Booking booking) {
		return service.addBooking(booking);
	}
	
	@GetMapping("/allBooking")
	public List<BookingDTO> getAllBookings(){
		return service.getAllBookings();
	}
	
	@PutMapping("/updateBooking/{id}")
	public BookingDTO updateBooking(@PathVariable Long id, @RequestBody Booking booking) {
		return service.updateBooking(id, booking);
	}
	
	@DeleteMapping("/deleteBooking/{id}")
	public boolean deleteBooking(@PathVariable Long id) {
		return service.deleteBooking(id);
	}
	
	@GetMapping("/bookingById")
	public BookingDTO readBookingById(@PathParam("id") Long id) {
		return service.readById(id);
	}
	
	@GetMapping("/bookingByBrand")
	public BookingDTO readByBrand(@PathParam("Brand") String brand) {
		return service.readByBrand(brand);

}
}