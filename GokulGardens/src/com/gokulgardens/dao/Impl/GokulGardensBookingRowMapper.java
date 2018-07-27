package com.gokulgardens.dao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gokulgardens.domain.Booking;

public class GokulGardensBookingRowMapper implements RowMapper<Booking> {

	@Override
	public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
		Booking booking = new Booking();

		booking.setBookingAdvanceAmountPaid(rs.getInt("booking_advance_amount_paid"));
		booking.setBookingBalanceDue(rs.getInt("booking_balance_due"));
		booking.setBookingCancellationReason(rs.getString("booking_cancellation_reason"));
		booking.setBookingDate(rs.getString("booking_date"));
		booking.setBookingDecorService(rs.getString("booking_decor_service"));
		booking.setBookingDecorServicePrice(rs.getInt("booking_decor_service_price"));
		booking.setBookingDecorServiceVendor(rs.getString("booking_decor_service_vendor"));
		booking.setBookingDescription(rs.getString("booking_description"));
		booking.setBookingDiscountAmount(rs.getInt("booking_discount_amount"));
		booking.setBookingDjService(rs.getString("booking_dj_service"));
		booking.setBookingDjServicePrice(rs.getInt("booking_dj_service_price"));
		booking.setBookingDjServiceVendor(rs.getString("booking_dj_service_price"));
		booking.setBookingElectricityEndReading(rs.getInt("booking_electricity_end_reading"));
		booking.setBookingElectricityPricePerUnit(rs.getInt("booking_electricity_price_per_unit"));
		booking.setBookingElectricityStartReading(rs.getInt("booking_electricity_start_reading"));
		booking.setBookingEndTime(rs.getString("booking_end_time"));
		booking.setBookingEventType(rs.getString("booking_event_type"));
		booking.setBookingHallType(rs.getString("booking_hall_type"));
		booking.setBookingId(rs.getInt("booking_id"));
		booking.setBookingLastUpdateId(rs.getInt("booking_last_update_id"));
		booking.setBookingPackageAmount(rs.getInt("booking_package_amount"));
		booking.setBookingPhotographyService(rs.getString("booking_photography_service"));
		booking.setBookingPhotographyServicePrice(rs.getInt("booking_photography_service_price"));
		booking.setBookingPhotographyServiceVendor(rs.getString("booking_photography_service_vendor"));
		booking.setBookingStartTime(rs.getString("booking_start_time"));
		booking.setBookingStatus(rs.getString("booking_status"));
		booking.setBookingWaiterService(rs.getString("booking_waiter_service"));
		booking.setBookingWaiterServicePrice(rs.getInt("booking_waiter_service_price"));
		booking.setBookingWaiterServiceVendor(rs.getString("booking_waiter_service_vendor"));
		booking.setCustomerId(rs.getInt("customer_id"));

		return booking;
	}

}
