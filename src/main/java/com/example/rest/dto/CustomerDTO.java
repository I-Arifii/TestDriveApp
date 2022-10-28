package com.example.rest.dto;

import com.example.persitence.domain.Booking;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

public class CustomerDTO {

	private Long CustomerId;;
	private String CustomerName;
	private Long CustomerPhone;
	private String CustomerEmail;
	private String CustomerAddress;
	public CustomerDTO(Long customerId, String customerName, Long customerPhone, String customerEmail,
			String customerAddress) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		CustomerPhone = customerPhone;
		CustomerEmail = customerEmail;
		CustomerAddress = customerAddress;
	}
	public CustomerDTO() {
		super();
	}
	@Override
	public String toString() {
		return "CustomerDTO [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", CustomerPhone="
				+ CustomerPhone + ", CustomerEmail=" + CustomerEmail + ", CustomerAddress=" + CustomerAddress + "]";
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

	
	
}   