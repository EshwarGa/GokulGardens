package com.gokulgardens.dao.Impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.gokulgardens.dao.GokulGardensPaymentDao;
import com.gokulgardens.domain.Payment;

@Repository
public class GokulGardensPaymentDaoImpl implements GokulGardensPaymentDao {

	NamedParameterJdbcTemplate namedParamJdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {

		namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);

	}

	@Override
	public boolean createPayment(Payment payment) {
		SqlParameterSource param = new BeanPropertySqlParameterSource(payment);
		String sqlQuery = "INSERT INTO payment (payment_type, payment_amount, payment_booking_id, payment_time, payment_date, "
				+ "payment_comments) VALUES (:paymentType, :paymentAmount, :paymentBookingId, "
				+ ":paymentTime, :paymentDate, :paymentComments)";
		return namedParamJdbcTemplate.update(sqlQuery, param) == 1;
	}

	@Override
	public Payment getpayment(int id) {
		SqlParameterSource param = new MapSqlParameterSource("ID", id);
		String sqlQuery = "SELECT * FROM payment WHERE payment_id = :ID";
		return namedParamJdbcTemplate.queryForObject(sqlQuery, param, new GokulGardensPaymentRowMapper());
	}

	@Override
	public List<Payment> getPayments(int bookingId) {
		SqlParameterSource param = new MapSqlParameterSource("ID", bookingId);
		String sqlQuery = "SELECT * FROM payment WHERE payment_booking_id = :ID";
		List<Payment> payments = namedParamJdbcTemplate.query(sqlQuery, param, new GokulGardensPaymentRowMapper());
		return payments;
	}

	@Override
	public List<Payment> getAllPayments() {
		String sqlQuery = "SELECT * FROM payment";
		List<Payment> payments = namedParamJdbcTemplate.query(sqlQuery, new GokulGardensPaymentRowMapper());
		return payments;
	}

	@Override
	public boolean updatePayment(Payment payment) {
		SqlParameterSource param = new BeanPropertySqlParameterSource(payment);
		String sqlQuery = "UPDATE payment SET payment_type = :paymentType, payment_amount = :paymentAmount, "
				+ "payment_booking_id = :paymentBookingId, payment_time = :paymentTime, payment_date = :paymentDate, "
				+ "payment_comments = :paymentComments WHERE payment_id = :paymentId";
		return namedParamJdbcTemplate.update(sqlQuery, param) == 1;
	}

	@Override
	public void cleanup() {
		String sqlQuery = "TRUNCATE TABLE payment";

		namedParamJdbcTemplate.getJdbcOperations().execute(sqlQuery);
	}

}
