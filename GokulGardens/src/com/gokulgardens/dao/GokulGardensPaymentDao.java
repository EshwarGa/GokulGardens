package com.gokulgardens.dao;

import java.util.List;

import javax.sql.DataSource;

import com.gokulgardens.domain.Payment;

public interface GokulGardensPaymentDao {
	
	// Set the data source that will be required to create a connection to the
			// database.
			public void setDataSource(DataSource ds);

			// Create a record in the payment table
			public boolean createPayment(Payment payment);

			// retrieve a single payment
			public Payment getpayment(int id);
			
			// retrieve multiple payments based on booking_id
			public List<Payment> getPayments(int id);
			
			// retrieve all payments
			public List<Payment> getAllPayments();

			// Update an existing organization.
			public boolean updatePayment(Payment payment);
			
			// Cleanup
			
			public void cleanup();
	
}
