package com.gokulgardens.domain;

public class Customer {

	// Declaring all the fields of Customer Class.

	private int customerId;
	private String customerName;
	private String customerPhone;
	private String customerEmail;
	private String customerAddress;
	private String customerCity;
	private String customerState;
	private String customerPin;
	
	// Empty Constructor
	public Customer() {
	}

	// Constructor using Id

	public Customer(int customerId, String customerName, String customerPhone, String customerEmail,
			String customerAddress, String customerCity, String customerState, String customerPin) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.customerCity = customerCity;
		this.customerState = customerState;
		this.customerPin = customerPin;
	}

	// Constructor without Id

	public Customer(String customerName, String customerPhone, String customerEmail, String customerAddress,
			String customerCity, String customerState, String customerPin) {
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.customerCity = customerCity;
		this.customerState = customerState;
		this.customerPin = customerPin;
	}

	// Declaring the getter and setter methods of the Customer Class.

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	public String getCustomerPin() {
		return customerPin;
	}

	public void setCustomerPin(String customerPin) {
		this.customerPin = customerPin;
	}

}
