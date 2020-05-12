package com.duplicate.programss;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatterDemo {

	public static String getDateDemo(){
		
		
		DateFormat date = new SimpleDateFormat("_yyyy-MM-dd_hh-mm-ss");
		  Calendar cal = Calendar.getInstance();
		  String da =date.format(cal.getTime());
System.out.println(da);		
		return da;
		
	}
	
	

}

