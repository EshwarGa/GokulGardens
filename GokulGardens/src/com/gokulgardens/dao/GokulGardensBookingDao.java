package com.gokulgardens.dao;

import java.util.List;

import javax.sql.DataSource;

import com.gokulgardens.domain.Booking;

public interface GokulGardensBookingDao {

	// Set the data source that will be required to create a connection to the
	// database.
	public void setDataSource(DataSource ds);

	// Create a record in the organization table
	public boolean createBooking(Booking booking);

	// retrieve a single organization
	public Booking getBooking(int id);

	// Retrieve all organizations from the table.
	public List<Booking> getAllBookings();

	// Delete a specific organization from the table.
	public boolean deleteBooking(Booking booking);

	// Update an existing organization.
	public boolean updateBooking(Booking booking);
	
	// Cleanup
	
	public void cleanup();

}
