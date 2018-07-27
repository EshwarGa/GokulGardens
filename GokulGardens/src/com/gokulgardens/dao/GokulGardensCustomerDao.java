package com.gokulgardens.dao;

import java.util.List;

import javax.sql.DataSource;

import com.gokulgardens.domain.Customer;

public interface GokulGardensCustomerDao {

	// Set the data source that will be required to create a connection to the
				// database.
				public void setDataSource(DataSource ds);

				// Create a record in the payment table
				public boolean createCustomer(Customer customer);

				// retrieve a single payment
				public Customer getCustomer(int id);
				
				// retrieve all payments
				public List<Customer> getAllCustomers();

				// Update an existing organization.
				public boolean updatePayment(Customer customer);
				
				// Cleanup
				
				public void cleanup();
	
}
