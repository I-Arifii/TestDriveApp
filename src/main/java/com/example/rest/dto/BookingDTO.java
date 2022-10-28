package com.example.rest.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.persitence.domain.Booking;
import com.example.persitence.domain.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class BookingDTO {
	
	private Long id;
	private String brand;
	private String model;
	private Float price;
	private Float date;
    private List<Customer> customers = new ArrayList<>();
	public BookingDTO(Long id, String brand, String model, Float price, Float date, List<Customer> customers) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.date = date;
		this.customers = customers;
	}
	public BookingDTO() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Float getDate() {
		return date;
	}
	public void setDate(Float date) {
		this.date = date;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	@Override
	public String toString() {
		return "BookingDTO [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", date=" + date
				+ "]";
	}
	
}