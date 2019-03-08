package cal_d.calendar;

import java.util.Scanner;

public class Calendar {
	private final int[] MAX_DAYS = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final int[] LEAP_MAX_DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}

	public int getmaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month];
		} else {
			return MAX_DAYS[month];
		}
	}



	private int getWeekDay(int year, int month, int day) {
		int syear = 1970;
		int standardWeekday = 3;
		int count = 0;
		for (int i = syear; i < year; i++) {
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}
		for (int i = 1; i < month; i++) {
			int delta = getmaxDaysOfMonth(year, i);
			count += delta;
		}
		count += day ;
		int weekday = (count + standardWeekday) % 7;
		

		return weekday;
	}
	
	public void printCalendar(int year, int month) {
		System.out.printf("     <<%4d년%3d월>>\n", year, month);
		System.out.println("    일   월   화    수   목    금   토");
		System.out.println(" -----------------------");
		
		int weekday = getWeekDay(year,month,1);
		int maxDay = getmaxDaysOfMonth(year, month);
		int count = 7 - weekday;
		int delim = (count < 7 ) ? count : 0;
		
		
		for (int i = 0; i < weekday; i++) {
			System.out.print("   ");
		} 
		
		for(int i = 1; i <= count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		count++;
		for(int i = count;i <= maxDay;i++) {
			System.out.printf("%3d", i);
			if (i % 7 == delim)
				System.out.println();
		}
		System.out.println();
	
	}
	
}

//		System.out.println("1  2  3  4  5  6  7");
//		System.out.println("8  9  10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
