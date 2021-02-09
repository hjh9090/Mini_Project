package com.library.rent;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;


public class RentModel {

	
	
	public static void DateRent(HttpServletRequest request) {
		
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(new Date());
		SimpleDateFormat date = new SimpleDateFormat("yyyy³â MM¿ù ddÀÏ");
		cal.add(Calendar.DAY_OF_WEEK, 14);
		String returndate = date.format(cal.getTime());
		
		request.setAttribute("returndate", returndate);
		
	}
	
	
}
