package com.gokulgardens.domain;

public class Booking {

	// Declaring all the fields for the Booking Class.

	private int bookingId;
	private int customerId;
	private String bookingDate;
	private String bookingStartTime;
	private String bookingEndTime;
	private String bookingEventType;
	private String bookingDescription;
	private int bookingPackageAmount;
	private int bookingAdvanceAmountPaid;
	private String bookingStatus;
	private int bookingDiscountAmount;
	private String bookingWaiterService;
	private int bookingWaiterServicePrice;
	private String bookingWaiterServiceVendor;
	private String bookingPhotographyService;
	private int bookingPhotographyServicePrice;
	private String bookingPhotographyServiceVendor;
	private String bookingDjService;
	private int bookingDjServicePrice;
	private String bookingDjServiceVendor;
	private String bookingDecorService;
	private int bookingDecorServicePrice;
	private String bookingDecorServiceVendor;
	private String bookingHallType;
	private String bookingCancellationReason;
	private int bookingBalanceDue;
	private int bookingLastUpdateId;
	private int bookingElectricityStartReading;
	private int bookingElectricityEndReading;
	private int bookingElectricityPricePerUnit;

	// Constructor with no arguments.
	
	public Booking() {
	}

	// Constructor using Id

	public Booking(int bookingId, int customerId, String bookingDate, String bookingStartTime, String bookingEndTime,
			String bookingEventType, String bookingDescription, int bookingPackageAmount, int bookingAdvanceAmountPaid,
			String bookingStatus, int bookingDiscountAmount, String bookingWaiterService, int bookingWaiterServicePrice,
			String bookingWaiterServiceVendor, String bookingPhotographyService, int bookingPhotographyServicePrice,
			String bookingPhotographyServiceVendor, String bookingDjService, int bookingDjServicePrice,
			String bookingDjServiceVendor, String bookingDecorService, int bookingDecorServicePrice,
			String bookingDecorServiceVendor, String bookingHallType, String bookingCancellationReason,
			int bookingBalanceDue, int bookingLastUpdateId, int bookingElectricityStartReading,
			int bookingElectricityEndReading, int bookingElectricityPricePerUnit) {
		this.bookingId = bookingId;
		this.customerId = customerId;
		this.bookingDate = bookingDate;
		this.bookingStartTime = bookingStartTime;
		this.bookingEndTime = bookingEndTime;
		this.bookingEventType = bookingEventType;
		this.bookingDescription = bookingDescription;
		this.bookingPackageAmount = bookingPackageAmount;
		this.bookingAdvanceAmountPaid = bookingAdvanceAmountPaid;
		this.bookingStatus = bookingStatus;
		this.bookingDiscountAmount = bookingDiscountAmount;
		this.bookingWaiterService = bookingWaiterService;
		this.bookingWaiterServicePrice = bookingWaiterServicePrice;
		this.bookingWaiterServiceVendor = bookingWaiterServiceVendor;
		this.bookingPhotographyService = bookingPhotographyService;
		this.bookingPhotographyServicePrice = bookingPhotographyServicePrice;
		this.bookingPhotographyServiceVendor = bookingPhotographyServiceVendor;
		this.bookingDjService = bookingDjService;
		this.bookingDjServicePrice = bookingDjServicePrice;
		this.bookingDjServiceVendor = bookingDjServiceVendor;
		this.bookingDecorService = bookingDecorService;
		this.bookingDecorServicePrice = bookingDecorServicePrice;
		this.bookingDecorServiceVendor = bookingDecorServiceVendor;
		this.bookingHallType = bookingHallType;
		this.bookingCancellationReason = bookingCancellationReason;
		this.bookingBalanceDue = bookingBalanceDue;
		this.bookingLastUpdateId = bookingLastUpdateId;
		this.bookingElectricityStartReading = bookingElectricityStartReading;
		this.bookingElectricityEndReading = bookingElectricityEndReading;
		this.bookingElectricityPricePerUnit = bookingElectricityPricePerUnit;
	}

	// Constructor without Id

	public Booking(int customerId, String bookingDate, String bookingStartTime, String bookingEndTime,
			String bookingEventType, String bookingDescription, int bookingPackageAmount, int bookingAdvanceAmountPaid,
			String bookingStatus, int bookingDiscountAmount, String bookingWaiterService, int bookingWaiterServicePrice,
			String bookingWaiterServiceVendor, String bookingPhotographyService, int bookingPhotographyServicePrice,
			String bookingPhotographyServiceVendor, String bookingDjService, int bookingDjServicePrice,
			String bookingDjServiceVendor, String bookingDecorService, int bookingDecorServicePrice,
			String bookingDecorServiceVendor, String bookingHallType, String bookingCancellationReason,
			int bookingBalanceDue, int bookingLastUpdateId, int bookingElectricityStartReading,
			int bookingElectricityEndReading, int bookingElectricityPricePerUnit) {
		this.customerId = customerId;
		this.bookingDate = bookingDate;
		this.bookingStartTime = bookingStartTime;
		this.bookingEndTime = bookingEndTime;
		this.bookingEventType = bookingEventType;
		this.bookingDescription = bookingDescription;
		this.bookingPackageAmount = bookingPackageAmount;
		this.bookingAdvanceAmountPaid = bookingAdvanceAmountPaid;
		this.bookingStatus = bookingStatus;
		this.bookingDiscountAmount = bookingDiscountAmount;
		this.bookingWaiterService = bookingWaiterService;
		this.bookingWaiterServicePrice = bookingWaiterServicePrice;
		this.bookingWaiterServiceVendor = bookingWaiterServiceVendor;
		this.bookingPhotographyService = bookingPhotographyService;
		this.bookingPhotographyServicePrice = bookingPhotographyServicePrice;
		this.bookingPhotographyServiceVendor = bookingPhotographyServiceVendor;
		this.bookingDjService = bookingDjService;
		this.bookingDjServicePrice = bookingDjServicePrice;
		this.bookingDjServiceVendor = bookingDjServiceVendor;
		this.bookingDecorService = bookingDecorService;
		this.bookingDecorServicePrice = bookingDecorServicePrice;
		this.bookingDecorServiceVendor = bookingDecorServiceVendor;
		this.bookingHallType = bookingHallType;
		this.bookingCancellationReason = bookingCancellationReason;
		this.bookingBalanceDue = bookingBalanceDue;
		this.bookingLastUpdateId = bookingLastUpdateId;
		this.bookingElectricityStartReading = bookingElectricityStartReading;
		this.bookingElectricityEndReading = bookingElectricityEndReading;
		this.bookingElectricityPricePerUnit = bookingElectricityPricePerUnit;
	}

	// Declaring getter and setter methods for all the fields of the Booking Class.

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getBookingStartTime() {
		return bookingStartTime;
	}

	public void setBookingStartTime(String bookingStartTime) {
		this.bookingStartTime = bookingStartTime;
	}

	public String getBookingEndTime() {
		return bookingEndTime;
	}

	public void setBookingEndTime(String bookingEndTime) {
		this.bookingEndTime = bookingEndTime;
	}

	public String getBookingEventType() {
		return bookingEventType;
	}

	public void setBookingEventType(String bookingEventType) {
		this.bookingEventType = bookingEventType;
	}

	public String getBookingDescription() {
		return bookingDescription;
	}

	public void setBookingDescription(String bookingDescription) {
		this.bookingDescription = bookingDescription;
	}

	public int getBookingPackageAmount() {
		return bookingPackageAmount;
	}

	public void setBookingPackageAmount(int bookingPackageAmount) {
		this.bookingPackageAmount = bookingPackageAmount;
	}

	public int getBookingAdvanceAmountPaid() {
		return bookingAdvanceAmountPaid;
	}

	public void setBookingAdvanceAmountPaid(int bookingAdvanceAmountPaid) {
		this.bookingAdvanceAmountPaid = bookingAdvanceAmountPaid;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public int getBookingDiscountAmount() {
		return bookingDiscountAmount;
	}

	public void setBookingDiscountAmount(int bookingDiscountAmount) {
		this.bookingDiscountAmount = bookingDiscountAmount;
	}

	public String getBookingWaiterService() {
		return bookingWaiterService;
	}

	public void setBookingWaiterService(String bookingWaiterService) {
		this.bookingWaiterService = bookingWaiterService;
	}

	public int getBookingWaiterServicePrice() {
		return bookingWaiterServicePrice;
	}

	public void setBookingWaiterServicePrice(int bookingWaiterServicePrice) {
		this.bookingWaiterServicePrice = bookingWaiterServicePrice;
	}

	public String getBookingWaiterServiceVendor() {
		return bookingWaiterServiceVendor;
	}

	public void setBookingWaiterServiceVendor(String bookingWaiterServiceVendor) {
		this.bookingWaiterServiceVendor = bookingWaiterServiceVendor;
	}

	public String getBookingPhotographyService() {
		return bookingPhotographyService;
	}

	public void setBookingPhotographyService(String bookingPhotographyService) {
		this.bookingPhotographyService = bookingPhotographyService;
	}

	public int getBookingPhotographyServicePrice() {
		return bookingPhotographyServicePrice;
	}

	public void setBookingPhotographyServicePrice(int bookingPhotographyServicePrice) {
		this.bookingPhotographyServicePrice = bookingPhotographyServicePrice;
	}

	public String getBookingPhotographyServiceVendor() {
		return bookingPhotographyServiceVendor;
	}

	public void setBookingPhotographyServiceVendor(String bookingPhotographyServiceVendor) {
		this.bookingPhotographyServiceVendor = bookingPhotographyServiceVendor;
	}

	public String getBookingDjService() {
		return bookingDjService;
	}

	public void setBookingDjService(String bookingDjService) {
		this.bookingDjService = bookingDjService;
	}

	public int getBookingDjServicePrice() {
		return bookingDjServicePrice;
	}

	public void setBookingDjServicePrice(int bookingDjServicePrice) {
		this.bookingDjServicePrice = bookingDjServicePrice;
	}

	public String getBookingDjServiceVendor() {
		return bookingDjServiceVendor;
	}

	public void setBookingDjServiceVendor(String bookingDjServiceVendor) {
		this.bookingDjServiceVendor = bookingDjServiceVendor;
	}

	public String getBookingDecorService() {
		return bookingDecorService;
	}

	public void setBookingDecorService(String bookingDecorService) {
		this.bookingDecorService = bookingDecorService;
	}

	public int getBookingDecorServicePrice() {
		return bookingDecorServicePrice;
	}

	public void setBookingDecorServicePrice(int bookingDecorServicePrice) {
		this.bookingDecorServicePrice = bookingDecorServicePrice;
	}

	public String getBookingDecorServiceVendor() {
		return bookingDecorServiceVendor;
	}

	public void setBookingDecorServiceVendor(String bookingDecorServiceVendor) {
		this.bookingDecorServiceVendor = bookingDecorServiceVendor;
	}

	public String getBookingHallType() {
		return bookingHallType;
	}

	public void setBookingHallType(String bookingHallType) {
		this.bookingHallType = bookingHallType;
	}

	public String getBookingCancellationReason() {
		return bookingCancellationReason;
	}

	public void setBookingCancellationReason(String bookingCancellationReason) {
		this.bookingCancellationReason = bookingCancellationReason;
	}

	public int getBookingBalanceDue() {
		return bookingBalanceDue;
	}

	public void setBookingBalanceDue(int bookingBalanceDue) {
		this.bookingBalanceDue = bookingBalanceDue;
	}

	public int getBookingLastUpdateId() {
		return bookingLastUpdateId;
	}

	public void setBookingLastUpdateId(int bookingLastUpdateId) {
		this.bookingLastUpdateId = bookingLastUpdateId;
	}

	public int getBookingElectricityStartReading() {
		return bookingElectricityStartReading;
	}

	public void setBookingElectricityStartReading(int bookingElectricityStartReading) {
		this.bookingElectricityStartReading = bookingElectricityStartReading;
	}

	public int getBookingElectricityEndReading() {
		return bookingElectricityEndReading;
	}

	public void setBookingElectricityEndReading(int bookingElectricityEndReading) {
		this.bookingElectricityEndReading = bookingElectricityEndReading;
	}

	public int getBookingElectricityPricePerUnit() {
		return bookingElectricityPricePerUnit;
	}

	public void setBookingElectricityPricePerUnit(int bookingElectricityPricePerUnit) {
		this.bookingElectricityPricePerUnit = bookingElectricityPricePerUnit;
	}

	// Declaring toString method to output class details. Used mainly to update the
	// update_pre_update_image of the update_log table of the gokul_gardens_db
	// database.
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", customerId=" + customerId + ", bookingDate=" + bookingDate
				+ ", bookingStartTime=" + bookingStartTime + ", bookingEndTime=" + bookingEndTime
				+ ", bookingEventType=" + bookingEventType + ", bookingDescription=" + bookingDescription
				+ ", bookingPackageAmount=" + bookingPackageAmount + ", bookingAdvanceAmountPaid="
				+ bookingAdvanceAmountPaid + ", bookingStatus=" + bookingStatus + ", bookingDiscountAmount="
				+ bookingDiscountAmount + ", bookingWaiterService=" + bookingWaiterService
				+ ", bookingWaiterServicePrice=" + bookingWaiterServicePrice + ", bookingWaiterServiceVendor="
				+ bookingWaiterServiceVendor + ", bookingPhotographyService=" + bookingPhotographyService
				+ ", bookingPhotographyServicePrice=" + bookingPhotographyServicePrice
				+ ", bookingPhotographyServiceVendor=" + bookingPhotographyServiceVendor + ", bookingDjService="
				+ bookingDjService + ", bookingDjServicePrice=" + bookingDjServicePrice + ", bookingDjServiceVendor="
				+ bookingDjServiceVendor + ", bookingDecorService=" + bookingDecorService
				+ ", bookingDecorServicePrice=" + bookingDecorServicePrice + ", bookingDecorServiceVendor="
				+ bookingDecorServiceVendor + ", bookingHallType=" + bookingHallType + ", bookingCancellationReason="
				+ bookingCancellationReason + ", bookingBalanceDue=" + bookingBalanceDue + ", bookingLastUpdateId="
				+ bookingLastUpdateId + ", bookingElectricityStartReading=" + bookingElectricityStartReading
				+ ", bookingElectricityEndReading=" + bookingElectricityEndReading + ", bookingElectricityPricePerUnit="
				+ bookingElectricityPricePerUnit + "]";
	}

}
