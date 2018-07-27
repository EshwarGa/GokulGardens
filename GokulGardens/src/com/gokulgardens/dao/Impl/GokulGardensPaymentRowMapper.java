package com.gokulgardens.dao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gokulgardens.domain.Payment;

public class GokulGardensPaymentRowMapper implements RowMapper<Payment> {

	@Override
	public Payment mapRow(ResultSet rs, int rowNum) throws SQLException {
		Payment payment = new Payment();
		payment.setPaymentAmount(rs.getInt("payment_amount"));
		payment.setPaymentBookingId(rs.getInt("payment_booking_id"));
		payment.setPaymentComments(rs.getString("payment_comments"));
		payment.setPaymentDate(rs.getString("payment_date"));
		payment.setPaymentId(rs.getInt("payment_id"));
		payment.setPaymentTime(rs.getString("payment_time"));
		payment.setPaymentType(rs.getString("payment_type"));
		return payment;
	}

}
