package com.gokulgardens.dao.Impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.gokulgardens.dao.GokulGardensBookingDao;
import com.gokulgardens.domain.Booking;

@Repository
public class GokulGardensBookingDaoImpl implements GokulGardensBookingDao {

	private NamedParameterJdbcTemplate namedParamJdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);

	}

	@Override
	public boolean createBooking(Booking booking) {
		SqlParameterSource beanParam = new BeanPropertySqlParameterSource(booking);
		String sqlQuery = "INSERT INTO booking (customer_id, booking_date, booking_start_time, booking_end_time, booking_event_type,"
				+ " booking_description, booking_package_amount, booking_advance_amount_paid, booking_status, booking_discount_amount,"
				+ " booking_waiter_service, booking_waiter_service_price, booking_waiter_service_vendor, booking_photography_service,"
				+ " booking_photography_service_price, booking_photography_service_vendor, booking_dj_service, booking_dj_service_price,"
				+ " booking_dj_service_vendor, booking_decor_service, booking_decor_service_price, booking_decor_service_vendor,"
				+ " booking_hall_type, booking_cancellation_reason, booking_balance_due, booking_last_update_id, "
				+ "booking_electricity_start_reading, booking_electricity_end_reading, booking_electricity_price_per_unit) VALUES(:customerId,"
				+ " :bookingDate, :bookingStartTime, :bookingEndTime, :bookingEventType, :bookingDescription, :bookingPackageAmount, :bookingAdvanceAmountPaid,"
				+ " :bookingStatus, :bookingDiscountAmount, :bookingWaiterService, :bookingWaiterServicePrice, :bookingWaiterServiceVendor, "
				+ ":bookingPhotographyService, :bookingPhotographyServicePrice, :bookingPhotographyServiceVendor, :bookingDjService, :bookingDjServicePrice, "
				+ ":bookingDjServiceVendor, :bookingDecorService, :bookingDecorServicePrice, :bookingDecorServiceVendor, :bookingHallType, "
				+ ":bookingCancellationReason, :bookingBalanceDue, :bookingLastUpdateId, :bookingElectricityStartReading, :bookingElectricityEndReading, "
				+ ":bookingElectricityPricePerUnit)";

		return namedParamJdbcTemplate.update(sqlQuery, beanParam) == 1;
	}

	@Override
	public Booking getBooking(int id) {
		SqlParameterSource params = new MapSqlParameterSource("ID", id);
		String sqlQuery = "SELECT * FROM booking WHERE booking_id = :ID";
		Booking booking = namedParamJdbcTemplate.queryForObject(sqlQuery, params, new GokulGardensBookingRowMapper());
		return booking;
	}

	@Override
	public List<Booking> getAllBookings() {
		String sqlQuery = "SELECT * FROM booking";
		List<Booking> bookings = namedParamJdbcTemplate.query(sqlQuery, new GokulGardensBookingRowMapper());
		return bookings;
	}

	@Override
	public boolean deleteBooking(Booking booking) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBooking(Booking booking) {
		SqlParameterSource beanParams = new BeanPropertySqlParameterSource(booking);
		String sqlQuery = "UPDATE booking SET customer_id = :customerId, booking_date = :bookingDate, booking_start_time = :bookingStartTime, "
				+ "booking_end_time = :bookingEndTime, booking_event_type = :bookingEventType, booking_description = :bookingDescription, "
				+ "booking_package_amount = :bookingPackageAmount, booking_advance_amount_paid = :bookingAdvanceAmountPaid, booking_status = :bookingStatus,"
				+ " booking_discount_amount = :bookingDiscountAmount, booking_waiter_service = :bookingWaiterService, booking_waiter_service_price = :bookingWaiterServicePrice,"
				+ " booking_waiter_service_vendor = :bookingWaiterServiceVendor, booking_photography_service = :bookingPhotographyService,"
				+ " booking_photography_service_price = :bookingPhotographyServicePrice, booking_photography_service_vendor = :bookingPhotographyServiceVendor, "
				+ "booking_dj_service = :bookingDjService, booking_dj_service_price = :bookingDjServicePrice, booking_dj_service_vendor = :bookingDjServiceVendor,"
				+ " booking_decor_service = :bookingDecorService, booking_decor_service_price = :bookingDecorServicePrice,"
				+ " booking_decor_service_vendor = :bookingDecorServiceVendor, booking_hall_type = :bookingHallType,"
				+ " booking_cancellation_reason = :bookingCancellationReason, booking_balance_due = :bookingBalanceDue, "
				+ "booking_last_update_id = :bookingLastUpdateId, booking_electricity_start_reading = :bookingElectricityStartReading, "
				+ "booking_electricity_end_reading = :bookingElectricityEndReading, booking_electricity_price_per_unit = :bookingElectricityPricePerUnit"
				+ " WHERE booking_id = :bookingId";
		return namedParamJdbcTemplate.update(sqlQuery, beanParams) == 1;
	}

	public void cleanup() {

		String sqlQuery = "TRUNCATE TABLE booking";

		namedParamJdbcTemplate.getJdbcOperations().execute(sqlQuery);

	}

}
