package com.gokulgardens.domain;

public class Payment {

	// Declaring all the fields of the Payment Class.

	private int paymentId;
	private String paymentType;
	private int paymentAmount;
	private int paymentBookingId;
	private String paymentTime;
	private String paymentDate;
	private String paymentComments;
	
	// Empty Constructor
	public Payment() {
	}

	// Constructor using Id

	public Payment(int paymentId, String paymentType, int paymentAmount, int paymentBookingId, String paymentTime,
			String paymentDate, String paymentComments) {
		this.paymentId = paymentId;
		this.paymentType = paymentType;
		this.paymentAmount = paymentAmount;
		this.paymentBookingId = paymentBookingId;
		this.paymentTime = paymentTime;
		this.paymentDate = paymentDate;
		this.paymentComments = paymentComments;
	}

	// Constructor without Id

	public Payment(String paymentType, int paymentAmount, int paymentBookingId, String paymentTime, String paymentDate,
			String paymentComments) {
		this.paymentType = paymentType;
		this.paymentAmount = paymentAmount;
		this.paymentBookingId = paymentBookingId;
		this.paymentTime = paymentTime;
		this.paymentDate = paymentDate;
		this.paymentComments = paymentComments;
	}

	// Declaring getter and setter methods for the Payment Class.
	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public int getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public int getPaymentBookingId() {
		return paymentBookingId;
	}

	public void setPaymentBookingId(int paymentBookingId) {
		this.paymentBookingId = paymentBookingId;
	}

	public String getPaymentTime() {
		return paymentTime;
	}

	public void setPaymentTime(String paymentTime) {
		this.paymentTime = paymentTime;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentComments() {
		return paymentComments;
	}

	public void setPaymentComments(String paymentComments) {
		this.paymentComments = paymentComments;
	}

}
