package com.ActionDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


import bsh.ParseException;

public class DateDemo {

	public static void main(String[] args) throws ParseException, IOException {
		// TODO Auto-generated method stub
		//Format the time
	/*	Date date = new Date();
		System.out.println(date.toString());
		SimpleDateFormat ft=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("Current Date: " + ft.format(date));*/
		
		//Comparing the time
		/*String time1 ="16:00:00";
		String time2 ="19:00:00";
		SimpleDateFormat format= new SimpleDateFormat("HH:mm:ss");
		Date date1 = format.parse(time1);
		Date date2 = format.parse(time2);
		long difference = date2.getTime() - date1.getTime();
		System.out.println("difference:" +difference);*/
		
		
		//
	/*	String time1 ="16:00:00";
		String time2 ="19:00:00";
		Date date1 = format.parse(time1);
		Date date2 = format.parse(time2);
		Date date3= new Date();
		Date date4= new Date();
		int cmp= date1.compareTo(date2);
		int comparison = date3.compareTo(date4);
		System.out.println(comparison);*/
		
		//
		/*Calendar calendar= new GregorianCalendar();
		int year=calendar.get(calendar.YEAR);
		int month=calendar.get(calendar.MONTH);
		int dayOfMonth=calendar.get(calendar.DAY_OF_MONTH);
		int dayOfWeek=calendar.get(calendar.DAY_OF_WEEK);
		int weekOfYear=calendar.get(calendar.WEEK_OF_YEAR);
		int weekOfMonth=calendar.get(calendar.WEEK_OF_MONTH);
		
		calendar.add(calendar.DAY_OF_MONTH, 1);
		int dayofMonthupdated=calendar.get(calendar.DAY_OF_MONTH);
		System.out.println("New day:"+dayofMonthupdated);*/
		
		
		//File handling
		FileReader fr=new FileReader("C:\\temp\\copy.txt");
		BufferedReader br=new BufferedReader(fr);
		int i;
		while((i=br.read())!=-1) {
			
			System.out.println((char)i);
		}
		br.close();
		fr.close();
	}

}
