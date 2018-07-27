package com.gokulgardens.dao.Impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.gokulgardens.dao.GokulGardensCustomerDao;
import com.gokulgardens.domain.Customer;

public class GokulGardensCustomerDaoImpl implements GokulGardensCustomerDao {

	NamedParameterJdbcTemplate namedParamJdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {

		namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);

	}

	@Override
	public boolean createCustomer(Customer customer) {

		SqlParameterSource param = new BeanPropertySqlParameterSource(customer);
		String sqlQuery = "INSERT INTO customer (customer_name, customer_phone, customer_email, customer_address, "
				+ "customer_city, customer_state, customer_pin) VALUES ( :customerName, :customerPhone, :customerEmail, "
				+ ":customerAddress, :customerCity, :customerState, :customerPin)";
		return namedParamJdbcTemplate.update(sqlQuery, param) == 1;
	}

	@Override
	public Customer getCustomer(int id) {
		SqlParameterSource param = new MapSqlParameterSource("ID", id);
		String sqlQuery = "SELECT * FROM customer WHERE customer_id = :ID";
		Customer customer = namedParamJdbcTemplate.queryForObject(sqlQuery, param, new GokulGardensCustomerRowMapper());
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		String sqlQuery = "SELECT * FROM customer";
		List<Customer> customers = namedParamJdbcTemplate.query(sqlQuery, new GokulGardensCustomerRowMapper());
		return customers;
	}

	@Override
	public boolean updatePayment(Customer customer) {
		SqlParameterSource param = new BeanPropertySqlParameterSource(customer);
		String SqlQuery = "UPDATE customer SET customer_name = :customerName, customer_phone = :customerPhone, customer_email = :customerEmail, "
				+ "customer_address = :customerAddress, customer_city = :customerCity, customer_state = :customerState, customer_pin = :customerPin "
				+ "WHERE customer_id = :customerId";
		return namedParamJdbcTemplate.update(SqlQuery, param) == 1;
	}

	@Override
	public void cleanup() {
		
		String sqlQuery = "TRUNCATE TABLE customer";

		namedParamJdbcTemplate.getJdbcOperations().execute(sqlQuery);

	}

}
