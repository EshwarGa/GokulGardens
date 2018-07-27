package com.gokulgardens.dao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gokulgardens.domain.Customer;

public class GokulGardensCustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setCustomerAddress(rs.getString("customer_address"));
		customer.setCustomerCity(rs.getString("customer_city"));
		customer.setCustomerEmail(rs.getString("customer_email"));
		customer.setCustomerId(rs.getInt("customer_id"));
		customer.setCustomerName(rs.getString("customer_name"));
		customer.setCustomerPhone(rs.getString("customer_phone"));
		customer.setCustomerPin(rs.getString("customer_pin"));
		customer.setCustomerState(rs.getString("customer_state"));
		return null;
	}

}
