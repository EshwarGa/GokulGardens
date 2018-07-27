package com.gokulgardens.dao;

import javax.sql.DataSource;

import com.gokulgardens.domain.User;

public interface GokulGardensUserDao {

	// Set the data source that will be required to create a connection to the
		// database.
		public void setDataSource(DataSource ds);

		// Create a record in the organization table
		public boolean createUser(User user);

		// retrieve a single organization
		public User getUser(int id);

		// Update an existing organization.
		public boolean updateUser(User user);
		
		// Cleanup
		
		public void cleanup();
	
}
