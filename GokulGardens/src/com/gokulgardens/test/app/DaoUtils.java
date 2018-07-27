package com.gokulgardens.test.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gokulgardens.dao.GokulGardensBookingDao;
import com.gokulgardens.domain.Booking;

@Service
public class DaoUtils {

	public void createSeedData(GokulGardensBookingDao dao) {

		Booking booking1 = new Booking(1, "08/20/2018", "4:00PM", "6:00PM", "marriage", "marriage of a certain couple",
				10000, 4000, "Booked", 500, "YES", 1000, "Bhomayya", "YES", 2000, "Bandanna", "YES", 3000, "Yerranna",
				"YES", 4000, "Mallanna", "A/C", "None", 14500, 1, 0, 0, 2);
		Booking booking2 = new Booking(2, "09/20/2018", "5:00PM", "7:00PM", "Cradle ceremony",
				"Cradle ceremony of a certain kid", 20000, 5000, "Cancelled", 500, "NO", 0, "NONE", "NO", 0, "NONE",
				"YES", 3000, "Yerranna", "YES", 4000, "Mallanna", "NON-A/C", "Too Pricy", 0, 1, 0, 0, 2);
		Booking booking3 = new Booking(3, "10/20/2018", "7:00PM", "8:00PM", "Engagement",
				"Engagement of a certain couple", 30000, 7000, "Booked", 1000, "YES", 1000, "Bhomayya", "YES", 2000,
				"Bandanna", "YES", 3000, "Yerranna", "YES", 4000, "Mallanna", "A/C", "None", 0, 1, 0, 0, 3);

		List<Booking> bookings = new ArrayList<Booking>();
		bookings.add(booking3);
		bookings.add(booking2);
		bookings.add(booking1);
		for (Booking booking : bookings) {
			if (dao.createBooking(booking))
				System.out.println("**********Booking has been made**********");
			else
				System.out.println("**********Booking was a failure**********");
		}
	}

	public void getAllBookings(GokulGardensBookingDao dao) {
		List<Booking> bookings = dao.getAllBookings();
		for (Booking booking : bookings) {
			System.out.println(booking);
		}
	}
	
	public void getBookingById(int id, GokulGardensBookingDao dao) {
		
		System.out.println("Printing Booking by id : " + id);
		System.out.println(dao.getBooking(id));
		
	}
	
	public void updateBooking(int id, GokulGardensBookingDao dao) {
		Booking booking = dao.getBooking(id);
		booking.setBookingEventType("Something Other than marriage");
		dao.updateBooking(booking);
	}

}
