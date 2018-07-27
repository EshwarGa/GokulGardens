package com.gokulgardens.test.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gokulgardens.dao.GokulGardensBookingDao;

@Controller
public class GokulGardensTestApp1 {

	@Autowired
	private GokulGardensBookingDao bookingDao;
	@Autowired
	private DaoUtils daoUtils;

	@RequestMapping("/")
	public void actionMethod() {

		daoUtils.createSeedData(bookingDao);
		daoUtils.getAllBookings(bookingDao);
		daoUtils.getBookingById(2, bookingDao);
		daoUtils.updateBooking(2, bookingDao);
		daoUtils.getBookingById(2, bookingDao);
		bookingDao.cleanup();
		daoUtils.getAllBookings(bookingDao);

	}

}
