package com.cap.lab.exercise9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;


public class DateDemo {
	public static void acceptDate(LocalDate d1,LocalDate d2)
	{
		Period p=Period.between(d1, d2);
		int years=p.getYears();
		int days=p.getDays();
		int months=p.getMonths();
		System.out.println("years:"+""+years+"days:"+days+"months"+months);
	}

	public static void main(String[] args) throws ParseException
	{
		
		//to convert string in to date we use parse method of a SimpleDateFormat Classes.
		LocalDate date1=LocalDate.of(1998, 03, 05);
		LocalDate date2=LocalDate.now();
		acceptDate(date1,date2);
	}
}

