package com.test01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class AbstractTest {

	public static AbstractTest getInstance() {
		
		GregorianCalendar cal = new GregorianCalendar();
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(day) {
		case 1: return new SunDay();
		case 2: return new MonDay();
		case 3: return new TuesDay();
		case 4: return new WednesDay();
		case 5: return new ThursDay();
		case 6: return new FriDay();
		case 7: return new SaturDay();
			
		}
		
		
		return null;
	}
	
	public abstract String dayInfo();
}
