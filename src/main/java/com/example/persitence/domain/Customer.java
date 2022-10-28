package com.example.persitence.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long CustomerId;
	
	@NotNull
	@Size(min = 0, max =50)
	private String CustomerName;
	
	@NotNull
//	@Size(min =0, max = 11)
	private Long CustomerPhone;
	
	@NotNull
	private String CustomerEmail;
	
	@NotNull
	private String CustomerAddress;
	
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
    private List<Booking> bookings= new ArrayList<>();

	public Customer(Long customerId, @NotNull @Size(min = 0, max = 50) String customerName,
			@NotNull @Size(min = 0, max = 11) Long customerPhone, @NotNull String customerEmail,
			@NotNull String customerAddress, List<Booking> bookings) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		CustomerPhone = customerPhone;
		CustomerEmail = customerEmail;
		CustomerAddress = customerAddress;
		this.bookings = bookings;
	}

	public Customer() {
		super();
	}

	public Long getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(Long customerId) {
		CustomerId = customerId;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public Long getCustomerPhone() {
		return CustomerPhone;
	}

	public void setCustomerPhone(Long customerPhone) {
		CustomerPhone = customerPhone;
	}

	public String getCustomerEmail() {
		return CustomerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}



}